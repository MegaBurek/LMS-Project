package lms.controllers;

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

import lms.domain.Administrator;
import lms.domain.Course;
import lms.domain.Student;
import lms.domain.StudyProgram;
import lms.domain.User;
import lms.dto.AdministratorDTO;
import lms.dto.StudentDTO;
import lms.service.AdministratorService;
import lms.service.CourseService;
import lms.service.LoginService;
import lms.service.StudentService;
import lms.service.StudyProgramService;
import lms.utils.View.HideOptionalProperties;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/administrator")
public class AdministratorController {

	@Autowired
	AdministratorService administratorService;
	
	@Autowired
	StudyProgramService studyProgramService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	StudentService studentService;

	@RequestMapping()
	public ResponseEntity<Iterable<AdministratorDTO>> getAllAdmin() {
		return new ResponseEntity<Iterable<AdministratorDTO>>(administratorService.getAllAdmin(), HttpStatus.OK);
	}

	@JsonView(HideOptionalProperties.class)
	@GetMapping(value = "/{id}")
	public ResponseEntity<AdministratorDTO> getAdministrator(@PathVariable Long id) {
		Optional<Administrator> faculty = administratorService.getAdminId(id);
		if (faculty.isPresent()) {
			return new ResponseEntity<AdministratorDTO>(faculty.get().toDTO(), HttpStatus.OK);
		}
		return new ResponseEntity<AdministratorDTO>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value = "/enrollment/{studyProgramId}/{yearNumber}")
	public ResponseEntity<Iterable<Student>> getAllStudentsWhoPass(@PathVariable Long studyProgramId, @PathVariable int yearNumber) {
		
		Optional<StudyProgram> studyProgram = studyProgramService.getStudyProgramId(studyProgramId);
	
		if (studyProgram.isPresent()) {
			return new ResponseEntity<Iterable<Student>>(administratorService.getAllStudentsWhoPass(studyProgram.get(), yearNumber), HttpStatus.OK);
		}
		return new ResponseEntity<Iterable<Student>>(HttpStatus.NOT_FOUND);
	}

}