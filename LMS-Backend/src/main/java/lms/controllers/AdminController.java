package lms.controllers;

import java.io.Console;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import lms.domain.Admin;
import lms.domain.Administrator;
import lms.domain.Course;
import lms.domain.Student;
import lms.domain.StudyProgram;
import lms.domain.Teacher;
import lms.domain.User;
import lms.dto.AdminDTO;
import lms.dto.AdministratorDTO;
import lms.dto.StudentDTO;
import lms.dto.TeacherDTO;
import lms.service.AdminService;
import lms.service.AdministratorService;
import lms.service.CourseService;
import lms.service.LoginService;
import lms.service.StudentService;
import lms.service.StudyProgramService;
import lms.service.TeacherService;
import lms.utils.View.HideOptionalProperties;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	AdministratorService administratorService;
	
	@Autowired
	StudyProgramService studyProgramService;
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	TeacherService teacherService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	StudentService studentService;

	@RequestMapping()
	public ResponseEntity<Iterable<AdminDTO>> getAllAdmin() {
		return new ResponseEntity<Iterable<AdminDTO>>(adminService.getAllAdmin(), HttpStatus.OK);
	}

	@JsonView(HideOptionalProperties.class)
	@GetMapping(value = "/{id}")
	public ResponseEntity<AdminDTO> getAdmin(@PathVariable Long id) {
		Optional<Admin> admin = adminService.getAdminId(id);
		if (admin.isPresent()) {
			return new ResponseEntity<AdminDTO>(admin.get().toDTO(), HttpStatus.OK);
		}
		return new ResponseEntity<AdminDTO>(HttpStatus.NOT_FOUND);
	}

	@PostMapping
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {

		adminService.addAdmin(admin);
		return new ResponseEntity<Admin>(admin, HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Admin> updateCountry(@PathVariable Long id, @RequestBody Admin admin) {
		adminService.updateAdmin(id, admin);
		return new ResponseEntity<Admin>(admin, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Admin> removeAdmin(@PathVariable Long id) {
		try {
			adminService.removeAdmin(id);
		} catch (Exception e) {
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Admin>(HttpStatus.NO_CONTENT);
	}
	
//	@GetMapping(value = "/upis/{studyProgramId}/{yearNumber}")
//	public ResponseEntity<Iterable<Student>> getAllStudentsWhoPass(@PathVariable Long studyProgramId, @PathVariable int yearNumber) {
//		
//		Optional<StudyProgram> studyProgram = studyProgramService.getStudyProgramId(studyProgramId);
//	
//		if (studyProgram.isPresent()) {
//			return new ResponseEntity<Iterable<Student>>(adminService.getAllStudentsWhoPass(studyProgram.get(), yearNumber), HttpStatus.OK);
//		}
//		return new ResponseEntity<Iterable<Student>>(HttpStatus.NOT_FOUND);
//	}
	
	@PostMapping(value = "/register/teacher")
	ResponseEntity<String> registerTeacher(@RequestBody Teacher teacher) {
		
		System.out.println(teacher);
		
		User user = new User(teacher.getUser().getUsername(), teacher.getUser().getPassword(), teacher.getUser().getRole());
		
		
		
		loginService.register(user);
		
		Teacher createdTeacher = new Teacher(teacher.getFirstName(), teacher.getLastName(), teacher.getPersonalIdentificationNumber(), user);
		
		teacherService.addTeacher(createdTeacher);
		
		return ResponseEntity.ok("Teacher Created!");
	}
	
	@PostMapping(value = "/register/admin")
	ResponseEntity<String> registerAdmin(@RequestBody Admin admin) {
		
		
		User user = new User(admin.getUser().getUsername(), admin.getUser().getPassword(), admin.getUser().getRole());
		
		loginService.register(user);
		
		Admin createdAdmin = new Admin(admin.getFirstname(), admin.getLastname(), user);
		
		adminService.addAdmin(createdAdmin);
		
		return ResponseEntity.ok("Admin Created!");
	}
	
	@PostMapping(value = "/register/administrator")
	ResponseEntity<String> registerAdministrator(@RequestBody Administrator administrator) {
		
		
		User user = new User(administrator.getUser().getUsername(), administrator.getUser().getPassword(), administrator.getUser().getRole());
		
		loginService.register(user);
		
		System.out.println(administrator.getFirstname());
		
		Administrator createdAdministrator = new Administrator(administrator.getFirstname(), administrator.getLastname(), user);
		
		administratorService.addAdministrator(createdAdministrator);
		
		return ResponseEntity.ok("Administrator Created!");
	}
	
	@PostMapping(value = "/register/student")
	ResponseEntity<String> registerStudent(@RequestBody Student student) {
		
		
		User user = new User(student.getUser().getUsername(), student.getUser().getPassword(), student.getUser().getRole());
		
		loginService.register(user);
		
		Student createdStudent = new Student(student.getFirstName(), student.getLastName(), student.getCardNumber(), user);
		
		try {
			studentService.addStudent(createdStudent);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		
		return ResponseEntity.ok("Student Created!");
	}
	
	@PostMapping(value = "/enroll")
	public ResponseEntity<Boolean>enrollStudentInNextYear(@RequestBody Long studentId, @RequestBody Set<Long> facultativeCourseIds)
	{
		
		Set<Course> facultativeCourses = new HashSet<Course>();
		
		for(Long id: facultativeCourseIds)
			facultativeCourses.add(courseService.getCourseId(id).get());
		
		Optional<Student> student = studentService.getStudentById(studentId);
		
		if(student.isPresent())
		{
			return new ResponseEntity<Boolean>(adminService.enrollStudentInNextYear(student.get(), facultativeCourses), HttpStatus.OK);
		}
		
		return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);
	}

}