package lms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lms.dto.AdminDTO;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	
	@Column(length = 128, nullable = false)
	private String firstName;

	@Column(length = 128, nullable = false)
	private String lastName;
	
	@OneToOne
    private User user;
	
	private String note;
	
	
	
	


	public Admin(Long id, String firstname, String lastname, User user, String note) {
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.user = user;
		this.note = note;
	}



	public Admin(Long id, String firstname, String lastname, String note) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.note = note;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFirstname() {
		return firstName;
	}



	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}



	public String getLastname() {
		return lastName;
	}



	public void setLastname(String lastname) {
		this.lastName = lastname;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}

	


	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Admin() {}



	public Admin(String firstname2, String lastname2, User user2) {
		this.firstName = firstname2;
		this.lastName = lastname2;
		this.user = user2;
	}
	
	public AdminDTO toDTO()
	{
		return new AdminDTO(this.firstName, this.lastName, this.user.toDTO());
		
	}
	
	
}
