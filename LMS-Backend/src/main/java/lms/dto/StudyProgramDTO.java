package lms.dto;

import java.util.Set;

public class StudyProgramDTO {
	
	
	private Long id;

	private String name;


	private String rukovodilac;

	private String center;

	private Set<YearOfStudyDTO> yearsOfStudy;

	
	

	public StudyProgramDTO(Long id, String name, Set<YearOfStudyDTO> yearsOfStudy) {
		this.id = id;
		this.name = name;
		this.yearsOfStudy = yearsOfStudy;
	}
	
	

	public StudyProgramDTO(Long id, String name, String center, Set<YearOfStudyDTO> yearsOfStudy) {
		this.id = id;
		this.name = name;
		this.center = center;
		this.yearsOfStudy = yearsOfStudy;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


	public String getRukovodilac() {
		return rukovodilac;
	}

	public void setRukovodilac(String rukovodilac) {
		this.rukovodilac = rukovodilac;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public Set<YearOfStudyDTO> getYearsOfStudy() {
		return yearsOfStudy;
	}

	public void setYearsOfStudy(Set<YearOfStudyDTO> yearsOfStudy) {
		this.yearsOfStudy = yearsOfStudy;
	}
	
	

}
