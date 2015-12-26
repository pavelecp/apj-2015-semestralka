package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.CustomerDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.FoodDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.EmployeeDAOInterface;

public class DefaultDAOFactory extends DAOFactory {

	@Override	
	public CustomerDAOInterface getCustomerDAO() {
		return CustomerDefaultDAO.getInstance();
	}

	@Override
	public EmployeeDAOInterface getEmployeeDAO() {
		return EmployeeDefaultDAO.getInstance();
	}

	@Override
	public FoodDAOInterface getFoodDAO() {
		return OrderDefaultDAO.getInstance();
	}

}
