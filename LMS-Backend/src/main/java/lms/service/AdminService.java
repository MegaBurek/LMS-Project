package lms.service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lms.domain.Admin;
import lms.domain.Course;
import lms.domain.CourseAttending;
import lms.domain.Student;
import lms.domain.StudentYear;
import lms.domain.StudyProgram;
import lms.domain.YearOfStudy;
import lms.dto.AdminDTO;
import lms.repository.AdminRepository;
import lms.repository.StudentYearRepository;
import lms.repository.YearOfStudyRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	StudentYearRepository studentYearRepository;
	
	@Autowired
	YearOfStudyRepository yearOfStudyRepository;
	
	public AdminService() {}

	public Iterable<AdminDTO> getAllAdmin() {
		
		Iterable<Admin> as = adminRepository.findAll();
		Set<AdminDTO> ret = new HashSet<>();

		for(Admin a: as)
			ret.add(a.toDTO());
		
		return ret;
	}

	public void addAdmin(Admin a) {
		adminRepository.save(a);
	}

	public Optional<Admin> getAdminId(Long id) {
		return adminRepository.findById(id);
	}

	public void removeAdmin(Long id) {
		Optional<Admin> a = adminRepository.findById(id);
		adminRepository.delete(a.get());
	}

	public void updateAdmin(Long id, Admin a) {
		Optional<Admin> add = adminRepository.findById(id);
		if (add.isPresent()) {
			a.setId(add.get().getId());
			adminRepository.save(a);
		}
	}
	
	public Iterable<Student>getAllStudentsWhoPass(StudyProgram studyProgram, int yearNumber)
	{
		
		YearOfStudy yearOfStudy = null;
		
		int pointsNeeded = yearNumber*48;
		
		for(YearOfStudy yos: studyProgram.getYearsOfStudy())
			if(yos.getNumberOfYear() == yearNumber)
			{
				yearOfStudy = yos;
			}
		
		
		Set<Student> ret = new HashSet<Student>();
		
		Set<Student> allStudentsOnYear = new HashSet<Student>();
		
		
		for(StudentYear sy: yearOfStudy.getStudentYears())
		{
			allStudentsOnYear.add(sy.getStudent());
		}
		
		for(Student s: allStudentsOnYear)
		{
			int points = 0;
			
			for(CourseAttending ca: s.getCourseAttendings())
			{
				points+=ca.getCourseRealization().getCourse().getEcts();
			}
			
			if(points>=pointsNeeded)
			{
				ret.add(s);
			}
		}
		
		
		return ret;
	}
	
	public boolean enrollStudentInNextYear(Student student, Set<Course>facultativeCourses)
	{
		
		
		boolean isIn = false;
		
		int currentYear = 0;
		
		StudyProgram studyProgram = null;
		
		for(StudentYear sy: student.getStudentYears())
		{
			currentYear++;
			studyProgram = sy.getYearOfStudy().getStudyProgram();
		}
		
		for(Student s: this.getAllStudentsWhoPass(studyProgram, currentYear))
			if(s == student)
				isIn = true;
			
		if(!isIn)
			return false;
		
		
		
		YearOfStudy nextYOS = null;
		
		
		for(YearOfStudy yos: yearOfStudyRepository.findAll())
		{
			if(yos.getStudyProgram() == studyProgram && yos.getNumberOfYear() == currentYear+1)
				nextYOS = yos;
		}
		
		for(Course c: facultativeCourses)
			if(c.isObligatory())
				return false;
		
	
			Set<Course> newSet = nextYOS.getCourses();
			
			newSet.addAll(facultativeCourses);
			
			nextYOS.setCourses(newSet);
		
		StudentYear nextYear = new StudentYear(LocalDate.now(), nextYOS, student);
		
		Set<StudentYear> newYears = student.getStudentYears();
		
		newYears.add(nextYear);
		
		student.setStudentYears(newYears);
		
		
		
		
		
		
		
		return true;
	}

}
