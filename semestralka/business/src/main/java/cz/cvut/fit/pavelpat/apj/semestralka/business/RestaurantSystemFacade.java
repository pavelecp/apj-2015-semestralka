package cz.cvut.fit.pavelpat.apj.semestralka.business;

import java.util.Collection;
import java.util.List;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Customer;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Employee;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Food;

public class RestaurantSystemFacade {

	private static RestaurantSystemFacade instance;

	public static RestaurantSystemFacade getInstance() {
		if (instance == null) {
			instance = new RestaurantSystemFacade();
		}
		return instance;
	}

	private RestaurantSystemFacade() {
	}

	public void addFood(Food order) {
		DAOFactory.getService().getFoodDAO().save(order);
	}

	public Collection<Food> getAllFood() {
		Collection<Food> all = DAOFactory.getService().getFoodDAO().getAll();
		return all;
	}

	public void createEmployee(Employee restaurant) {
		DAOFactory.getService().getEmployeeDAO().save(restaurant);
	}

	public Collection<Employee> getAllEmployees() {
		Collection<Employee> all = DAOFactory.getService().getEmployeeDAO().getAll();
		return all;
	}

	public void createCustomer(Customer customer) {
		DAOFactory.getService().getCustomerDAO().save(customer);
	}

	public Collection<Customer> getAllCustomers() {
		List<Customer> all = DAOFactory.getService().getCustomerDAO().getAll();
		return all;
	}

}
