package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl.DefaultDAOFactory;

public abstract class DAOFactory {

	private static DAOFactory daoFactory;
	
	public static DAOFactory getDAOFActory() {
		if (daoFactory == null) {
			daoFactory = new DefaultDAOFactory();
		}
		return daoFactory;
	}

	public abstract CustomerDAOInterface getCustomerDAO ();
	public abstract RestaurantDAOInterface getRestaurantDAO ();
	
}
