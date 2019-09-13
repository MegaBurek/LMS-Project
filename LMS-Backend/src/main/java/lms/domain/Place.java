package lms.domain;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Where;

import lms.dto.PlaceDTO;


@Entity
@Where(clause = "deleted = 'false'")
public class Place {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max = 50)
	private String name;
	
	@Version
	private int version = 0;
	
	@NotNull
	private Boolean deleted = false;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Country country;
	
	@OneToMany(mappedBy = "place", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Address> addresses;
	
	public Place() {}
	
	
	
	public Place(Long id, @Size(max = 50) String name, int version, @NotNull Boolean deleted, Country country,
			Set<Address> addresses) {
		this.id = id;
		this.name = name;
		this.version = version;
		this.deleted = deleted;
		this.country = country;
		this.addresses = addresses;
	}
	
	public Place(String name, Country country) {
		this.name = name;
		this.country = country;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	
	public PlaceDTO toDTO() {
		return new PlaceDTO(this.name, this.country.toDTO());
	}
}