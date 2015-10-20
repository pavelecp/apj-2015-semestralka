package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.CustomerDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.OrderDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.RestaurantDAOInterface;

public class DefaultDAOFactory extends DAOFactory {

	public CustomerDAOInterface getCustomerDAO() {
		return new CustomerDefaultDAO();
	}

	@Override
	public RestaurantDAOInterface getRestaurantDAO() {
		return new RestaurantDefaultDAO();
	}

	@Override
	public OrderDAOInterface getOrderDAO() {
		return OrderDefaultDAO.getInstance();
	}

}
