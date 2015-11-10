package cz.cvut.fit.pavelpat.apj.semestralka.business;

import java.util.Collection;
import java.util.List;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Address;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Customer;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Order;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Restaurant;

public class RestaurantsFacade {

	private static RestaurantsFacade instance;

	public static RestaurantsFacade getInstance() {
		if (instance == null) {
			instance = new RestaurantsFacade();
		}
		return instance;
	}

	private RestaurantsFacade() {
	}

	public void createOrder(Order order) {
		DAOFactory.getDefaultDao().getOrderDAO().save(order);
	}

	public Collection<Order> getAllOrders() {
		Collection<Order> all = DAOFactory.getDefaultDao().getOrderDAO().getAll();
		return all;
	}

	public void createRestaurant(Restaurant restaurant) {
		DAOFactory.getDefaultDao().getRestaurantDAO().save(restaurant);
	}

	public Collection<Restaurant> getAllRestaurants() {
		Collection<Restaurant> all = DAOFactory.getDefaultDao().getRestaurantDAO().getAll();
		return all;
	}

	public void createCustomer(Customer customer) {
		DAOFactory.getDefaultDao().getCustomerDAO().save(customer);
	}

	public Collection<Customer> getAllCustomers() {
		List<Customer> all = DAOFactory.getDefaultDao().getCustomerDAO().getAll();
		return all;
	}

	public void createRestaurant(String name, Address address) {
		DAOFactory.getDefaultDao().getRestaurantDAO().save(name, address);
	}	
}
