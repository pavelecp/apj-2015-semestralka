package cz.cvut.fit.pavelpat.apj.semestralka.model.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;
	private String street;
	private int postalNumber;

	public Address() {
	}
	
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
	
	@Override
	public String toString() {
		return street + ", " + postalNumber + " " + city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostalNumber(int postalNumber) {
		this.postalNumber = postalNumber;
	}
	
}
