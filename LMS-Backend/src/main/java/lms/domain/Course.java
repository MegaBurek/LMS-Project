package lms.domain;

import java.io.IOException;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Where;
import org.springframework.web.multipart.MultipartFile;

import lms.dto.CourseDTO;

@Entity
@Where(clause = "deleted = 'false'")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private Boolean deleted = false;

	@Size(max = 50)
	private String title;

	private int ects;

	private boolean obligatory;
	
	@Size(max = 640)
	private String description;

	private int numberOfLectures;

	private int numberOfExercises;

	@Version
	private int version = 0;

	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Set<CourseRealization> courseRealizations;

	@ManyToOne(fetch = FetchType.LAZY)
	private YearOfStudy yearOfStudy;

	public Course() {
	}

	public Course(Long id, @NotNull Boolean deleted, @Size(max = 50) String title, int ects, boolean obligatory,
			String description,int numberOfLectures, int numberOfExercises, int version, Set<CourseRealization> courseRealizations,
			YearOfStudy yearOfStudy) {
		super();
		this.id = id;
		this.deleted = deleted;
		this.title = title;
		this.ects = ects;
		this.obligatory = obligatory;
		this.description = description;
		this.numberOfLectures = numberOfLectures;
		this.numberOfExercises = numberOfExercises;
		this.version = version;
		this.courseRealizations = courseRealizations;
		this.yearOfStudy = yearOfStudy;
	}

	public Course(String title2, YearOfStudy yos) {
		this.title = title2;
		this.yearOfStudy = yos;
	}



	public YearOfStudy getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(YearOfStudy yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public Set<CourseRealization> getCourseRealizations() {
		return courseRealizations;
	}

	public void setCourseRealizations(Set<CourseRealization> courseRealizations) {
		this.courseRealizations = courseRealizations;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
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
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfLectures() {
		return numberOfLectures;
	}

	public void setNumberOfLectures(int numberOfLectures) {
		this.numberOfLectures = numberOfLectures;
	}

	public int getNumberOfExcercises() {
		return numberOfExercises;
	}

	public void setNumberOfExcercises(int numberOfExcercises) {
		this.numberOfExercises = numberOfExcercises;
	}
	
	public CourseDTO toDTO()
	{
		return new CourseDTO(this.id, this.title, this.ects, this.obligatory, this.numberOfLectures, this.numberOfExercises);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Course object = (Course) o;
		if (object.id == null || id == null) {
			return false;
		}
		return Objects.equals(id, object.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

}
