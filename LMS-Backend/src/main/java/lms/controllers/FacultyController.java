package lms.controllers;

import java.util.Optional;

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

import lms.domain.Faculty;
import lms.dto.FacultyDTO;
import lms.service.FacultyService;
import lms.utils.View.HideOptionalProperties;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/faculty")
public class FacultyController {

	@Autowired
	FacultyService facultyService;

	@RequestMapping()
	public ResponseEntity<Iterable<Faculty>> GetAllFaculties() {
		return new ResponseEntity<Iterable<Faculty>>(facultyService.getAllFaculties(), HttpStatus.OK);
	}

//	@RequestMapping("/faculties")
//	public ResponseEntity<Iterable<FacultyDTO>> getAllFacultiesDTO() {
//		return new ResponseEntity<Iterable<FacultyDTO>>(facultyService.getAllFacultiesDTO(), HttpStatus.OK);
//	}

//	@JsonView(HideOptionalProperties.class)
//	@GetMapping(value = "/{id}")
//	public ResponseEntity<FacultyDTO> getFacultyById(@PathVariable Long id) {
//		Optional<Faculty> faculty = facultyService.getFacultyId(id);
//		if (faculty.isPresent()) {
//			return new ResponseEntity<FacultyDTO>(faculty.toDTO(), HttpStatus.OK);
//		}
//		return new ResponseEntity<FacultyDTO>(HttpStatus.NOT_FOUND);
//	}
//	
//	@JsonView(HideOptionalProperties.class)
//	@GetMapping(value = "/{id}")
//	public ResponseEntity<FacultyDTO> getFacultyById(@PathVariable Long id) {
//		Optional<Faculty> faculty = facultyService.getFacultyId(id);
//		if (faculty.isPresent()) {
//			return new ResponseEntity<FacultyDTO>(faculty.toDTO(), HttpStatus.OK);
//		}
//		return new ResponseEntity<FacultyDTO>(HttpStatus.NOT_FOUND);
//	}

	@PostMapping
	public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {

		facultyService.addFaculty(faculty);
		return new ResponseEntity<Faculty>(faculty, HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Faculty> updateCountry(@PathVariable Long id, @RequestBody Faculty faculty) {
		facultyService.updateFaculty(id, faculty);
		return new ResponseEntity<Faculty>(faculty, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Faculty> removeFaculty(@PathVariable Long id) {
		try {
			facultyService.removeFaculty(id);
		} catch (Exception e) {
			return new ResponseEntity<Faculty>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Faculty>(HttpStatus.NO_CONTENT);
	}

}