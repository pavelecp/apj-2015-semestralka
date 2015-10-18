package cz.cvut.fit.pavelpat.apj.semestralka.model;

public class Address {

	private final String city;
	private final String street;
	private final int postalNumber;

	public Address(String city, String street, int postalNumber) {
		this.city = city;
		this.street = street;
		this.postalNumber = postalNumber;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public int getPostalNumber() {
		return postalNumber;
	}
	
}
