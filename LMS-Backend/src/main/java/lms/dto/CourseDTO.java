package lms.dto;

public class CourseDTO {

	private Long id;



	private String title;

	private int ects;

	private boolean obligatory;

	private int numberOfLectures;

	private int numberOfExcercises;

	private String yearOfStudy;

	
	public CourseDTO(Long id, String title, int ects, boolean obligatory, int numberOfLectures, int numberOfExcercises,
			String yearOfStudy) {
		this.id = id;
		this.title = title;
		this.ects = ects;
		this.obligatory = obligatory;
		this.numberOfLectures = numberOfLectures;
		this.numberOfExcercises = numberOfExcercises;
		this.yearOfStudy = yearOfStudy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public boolean isObligatory() {
		return obligatory;
	}

	public void setObligatory(boolean obligatory) {
		this.obligatory = obligatory;
	}

	public int getNumberOfLectures() {
		return numberOfLectures;
	}

	public void setNumberOfLectures(int numberOfLectures) {
		this.numberOfLectures = numberOfLectures;
	}

	public int getNumberOfExcercises() {
		return numberOfExcercises;
	}

	public void setNumberOfExcercises(int numberOfExcercises) {
		this.numberOfExcercises = numberOfExcercises;
	}

	

	public String getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(String yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
	

}
