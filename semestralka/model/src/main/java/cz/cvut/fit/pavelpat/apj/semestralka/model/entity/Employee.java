package cz.cvut.fit.pavelpat.apj.semestralka.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Employee {

	private long id;
	private String name;
	private Address address;
	private Date lastLogged;
	private List<Food> servedOrders;

	public Employee() {
	}
	
	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
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
	public Date getLastLogged() {
		return lastLogged;
	}
	public void setLastLogged(Date lastLogged) {
		this.lastLogged = lastLogged;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="servedOrders")
	public List<Food> getOrders() {
		return servedOrders;
	}
	public void setOrders(List<Food> orders) {
		this.servedOrders = orders;
	}
	
}
