package lms.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import lms.domain.User;
import lms.domain.Admin;
import lms.domain.Administrator;
import lms.domain.Student;
import lms.domain.Teacher;
import lms.dto.UserDTO;
import lms.repository.UserRepository;

@Service
public class UserService implements CommandLineRunner{
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	TeacherService teacherService;
	
	@Autowired
	AdministratorService administratorService;
	

	public Optional<User> getUser(String username) {
		return userRepository.getByUsername(username);
	}

	public Optional<User> getUser(String username, String password) {
		return userRepository.getByUsernameAndPassword(username, password);
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
	
	public Iterable<UserDTO> getUsersDTO() {
		Iterable<User> c = userRepository.findAll();
		Set<UserDTO> cd = new HashSet<>();
		for(User ct: c)
			cd.add(ct.toDTO());
		return cd;
	}
	
	public void removeUserSoft(Long id) {
		Optional<User> u = userRepository.findById(id);
		if(u.isPresent()) {
			u.get().setDeleted(true);
			userRepository.save(u.get());
		}
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		if(StreamSupport.stream(userRepository.findAll().spliterator(), false).count()<2)
		{	
			//admin
			User user1 = new User("MK", "123", "ROLE_ADMIN");
			loginService.register(user1);	
			Admin admin = new Admin("Mark", "Twain", user1);		
			adminService.addAdmin(admin);
			
			//administrator
			User user2 = new User("STRTR", "123", "ROLE_ADMINISTRATOR");
			loginService.register(user2);
			Administrator administrator = new Administrator("Jovana", "Kovic",user2);
			administratorService.addAdministrator(administrator);
			
			//teachers
			User user3 = new User("TCHR1", "123", "ROLE_TEACHER");
			loginService.register(user3);
			Teacher teacher1 = new Teacher("Sean", "Smith","700100",user3);
			teacherService.addTeacher(teacher1);
			
			User user4 = new User("TCHR2", "123", "ROLE_TEACHER");
			loginService.register(user4);
			Teacher teacher2 = new Teacher("Rick", "Roll","700101",user4);
			teacherService.addTeacher(teacher2);
			
			//students
			User user5 = new User("STDNT1", "123", "ROLE_STUDENT");
			loginService.register(user5);
			Student student1 = new Student("John", "Cena", "250260",user5);
			studentService.addStudent(student1);
			
			User user6 = new User("STDNT2", "123", "ROLE_STUDENT");
			loginService.register(user6);
			Student student2 = new Student("Rick", "Harrison", "250261",user6);
			studentService.addStudent(student2);
			
			User user7 = new User("STDNT3", "123", "ROLE_STUDENT");
			loginService.register(user7);
			Student student3 = new Student("John", "Cena", "250262",user7);
			studentService.addStudent(student3);
			
			
		}
	}
	
}