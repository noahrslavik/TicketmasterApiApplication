package co.grandcirucs.TicketmasterApiApp.Entities;

public class Venues {

	
	private String name;
	private City city;
	private Country country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Venues [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}
