package lms.controllers;



import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lms.domain.Admin;
import lms.domain.Administrator;
import lms.domain.Student;
import lms.domain.Teacher;
import lms.domain.User;
import lms.dto.AdminDTO;
import lms.dto.AdminRegDTO;
import lms.dto.AdministratorDTO;
import lms.dto.LoginDTO;
import lms.dto.StudentDTO;
import lms.dto.StudentRegDTO;
import lms.dto.TeacherDTO;
import lms.dto.TeacherRegDTO;
import lms.dto.UserDTO;
import lms.repository.TeacherRepository;
import lms.service.AdministratorService;
import lms.service.LoginService;
import lms.service.StudentService;
import lms.service.TeacherService;
import lms.service.UserService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class LoginController {
	
	
	
	
	@Autowired 
	LoginService loginService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	TeacherService teacherService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	AdministratorService administratorService;
	
	@PostMapping(value = "/login")
	ResponseEntity<HashMap<String, String>> login(@RequestBody LoginDTO set) {
		
		Optional<User> user = userService.getUser(set.getUsername());
		
		if(user.isPresent())
		{
			return loginService.login(set);
		}
		
		return new ResponseEntity<HashMap<String,String>>(HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping(value = "/register")
	ResponseEntity<UserDTO> register(@RequestBody User user) {
		return loginService.register(user);
	}

	
}