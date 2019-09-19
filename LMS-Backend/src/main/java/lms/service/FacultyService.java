package lms.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lms.domain.Admin;
import lms.domain.Faculty;
import lms.dto.AdminDTO;
import lms.dto.FacultyDTO;
import lms.repository.FacultyRepository;

@Service
public class FacultyService {

	@Autowired
	FacultyRepository facultyRepository;

	public FacultyService() {
	}

	public Iterable<FacultyDTO> getAllFacultiesDTO() {

		Iterable<Faculty> fs = facultyRepository.findAll();
		Set<FacultyDTO> ret = new HashSet<>();

		for (Faculty f : fs)
			ret.add(f.toDTO());

		return ret;
	}

	public List<Faculty> getAllFaculties() {
		return facultyRepository.findAll();
	}

	public Optional<Faculty> getFacultyId(Long id) {
		return facultyRepository.findById(id);
	}

	public void addFaculty(Faculty f) {
		facultyRepository.save(f);
	}

	public void removeFaculty(Long id) {
		Optional<Faculty> f = facultyRepository.findById(id);
		facultyRepository.delete(f.get());
	}

	public void updateFaculty(Long id, Faculty f) {
		Optional<Faculty> F = facultyRepository.findById(id);
		if (F.isPresent()) {
			f.setId(F.get().getId());
			facultyRepository.save(f);
		}
	}

	public Optional<Faculty> getFacultyById(Long id) {
		return facultyRepository.findById(id);
	}

}
