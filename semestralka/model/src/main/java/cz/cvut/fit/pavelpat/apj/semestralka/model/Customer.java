package cz.cvut.fit.pavelpat.apj.semestralka.model;

import java.util.ArrayList;
import java.util.List;

import cz.cvut.fit.pavelpat.apj.semestralka.model.id.CustomerID;

public class Customer {

	private final CustomerID id;
	private String name;
	private Address address;
	private List<Order> orders;

	public Customer(CustomerID id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
		orders = new ArrayList<>();
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

	public CustomerID getId() {
		return id;
	}

}
