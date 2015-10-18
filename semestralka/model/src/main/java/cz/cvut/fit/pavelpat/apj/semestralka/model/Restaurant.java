package cz.cvut.fit.pavelpat.apj.semestralka.model;

import java.util.ArrayList;
import java.util.List;

import cz.cvut.fit.pavelpat.apj.semestralka.model.id.RestaurantID;

public class Restaurant {

	private final RestaurantID id;
	private String name;
	private Address address;
	private List<Order> orders;

	public Restaurant(RestaurantID id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
		setOrders(new ArrayList<Order>());
	}

	public RestaurantID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
