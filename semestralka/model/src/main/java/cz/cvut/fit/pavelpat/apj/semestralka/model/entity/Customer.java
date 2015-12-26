package cz.cvut.fit.pavelpat.apj.semestralka.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	private long id;
	private String name;
	private Address address;
	private List<Food> orders;

	public Customer() {
	}

	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
		orders = new ArrayList<>();
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="customerorders")
	public List<Food> getOrders() {
		return orders;
	}

	public void setOrders(List<Food> orders) {
		this.orders = orders;
	}
}
