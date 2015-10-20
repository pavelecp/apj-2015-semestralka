package cz.cvut.fit.pavelpat.apj.semestralka.business;

import java.util.Collection;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Order;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Restaurant;

public class RestaurantsFacade {

	public static RestaurantsFacade instance = new RestaurantsFacade();
	
	public static RestaurantsFacade getRestaurantsFacade() {
		return instance;
	}
	
	private RestaurantsFacade () {
		
	}
	
	public void createOrder(Order order) {
		DAOFactory.getDAOFActory().getOrderDAO().save(order);
	}

	public Collection<Order> getAllOrders () {
		Collection<Order> all = DAOFactory.getDAOFActory().getOrderDAO().getAll();
		return all;
	}
	
	public void createRestaurant(Restaurant order) {
		DAOFactory.getDAOFActory().getRestaurantDAO().save(order);
	}
	
}
