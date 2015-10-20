package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.RestaurantDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.CustomerDAOInterface;

public class DefaultDAOFactory extends DAOFactory {

	public CustomerDAOInterface getCustomerDAO() {
		return new CustomerDefaultDAO();
	}

	@Override
	public RestaurantDAOInterface getRestaurantDAO() {
		return new RestaurantDefaultDAO();
	}

}
