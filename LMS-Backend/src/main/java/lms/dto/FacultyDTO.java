package lms.dto;

public class FacultyDTO {

	private String name;
	
	private TeacherDTO dekan;
	
	public FacultyDTO() {
		
	}
	
	public FacultyDTO(String name,TeacherDTO dekan) {
		this.name = name;
		this.dekan = dekan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TeacherDTO getDekan() {
		return dekan;
	}

	public void setDekan(TeacherDTO dekan) {
		this.dekan = dekan;
	}
	
	
}
