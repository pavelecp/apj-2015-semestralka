package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl.DefaultDAOFactory;

public abstract class DAOFactory {

	private static DAOFactory instance;
	
	public static DAOFactory getDefaultDao() {
		if (instance == null) {
			instance = new DefaultDAOFactory();
		}
		return instance;
	}

	public abstract CustomerDAOInterface getCustomerDAO ();
	public abstract RestaurantDAOInterface getRestaurantDAO ();
	public abstract OrderDAOInterface getOrderDAO ();
	
}
