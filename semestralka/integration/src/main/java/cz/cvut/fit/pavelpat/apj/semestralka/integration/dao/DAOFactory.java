package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import org.osgi.util.tracker.ServiceTracker;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl.DefaultDAOFactory;

public abstract class DAOFactory {

	private static DAOFactory instance;
	private static ServiceTracker<DAOFactory, DAOFactory> st;
	
	public static DAOFactory getService() {
		if (instance == null) {
            instance = st.getService();
            if (instance == null) {
                instance = new DefaultDAOFactory();
            }
        }
        return instance;
	}
	
//	private DAOFactory() {
//	}
	
	public abstract CustomerDAOInterface getCustomerDAO ();
	public abstract EmployeeDAOInterface getEmployeeDAO ();
	public abstract FoodDAOInterface getFoodDAO ();
	
	public static void setTracker (ServiceTracker<DAOFactory, DAOFactory> stp) {
		st = stp;
	}
	
}
