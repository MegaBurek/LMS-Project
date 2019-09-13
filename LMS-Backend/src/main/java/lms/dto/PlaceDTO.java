package lms.dto;

public class PlaceDTO {
	
	private String name;
	
	private CountryDTO country;
	
	public PlaceDTO(String name, CountryDTO country) {
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
	
	
}
