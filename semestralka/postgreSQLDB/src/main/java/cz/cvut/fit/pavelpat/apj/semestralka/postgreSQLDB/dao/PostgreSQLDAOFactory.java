package cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.CustomerDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.EmployeeDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.FoodDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Address;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Customer;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Food;
import cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.dao.impl.CustomerDAO;
import cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.dao.impl.EmployeeDAO;
import cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.dao.impl.OrderDAO;

public class PostgreSQLDAOFactory extends DAOFactory {

	protected SessionFactory sessFact;
	
	public PostgreSQLDAOFactory() {
		sessFact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	@Override
	public CustomerDAOInterface getCustomerDAO() {
		return CustomerDAO.getInstance(sessFact);
	}

	@Override
	public EmployeeDAOInterface getEmployeeDAO() {
		return EmployeeDAO.getInstance(sessFact);
	}

	@Override
	public FoodDAOInterface getFoodDAO() {
		return OrderDAO.getInstance(sessFact);
	}

	//TODO delete
	public static void main(String[] args) {
		PostgreSQLDAOFactory daoFact = new PostgreSQLDAOFactory();
		CustomerDAOInterface customerDao = daoFact.getCustomerDAO();
		System.out.println("allOK");
		
		Customer customer = new Customer("name", new Address("custCity","custStreet", 152));
		List<Food> orders = new ArrayList<>();
		orders.add(new Food("foooood", 123));
		customer.setOrders(orders);
		customerDao.save(customer);
		
		Collection<Customer> load = customerDao.getAll();
		for (Customer cust : load) {
			List<Food> loadedorders = cust.getOrders();
			System.out.println();
		}
		customerDao.close();
	}
	
}
