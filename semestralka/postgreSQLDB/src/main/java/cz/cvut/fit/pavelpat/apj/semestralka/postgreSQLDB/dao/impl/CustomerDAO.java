package cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.CustomerDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Customer;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Employee;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.CustomerID;

public class CustomerDAO implements CustomerDAOInterface {

	private static CustomerDAO instance;
	private SessionFactory sessFact;
	
	private CustomerDAO(SessionFactory sessFact) {
		this.sessFact = sessFact;
	}
	
	public static CustomerDAO getInstance(SessionFactory sessFact) {
		if (instance == null) {
			instance = new CustomerDAO(sessFact);
		}
		return instance;
	}
	
	@Override
	public void save(Customer objectToBeSaved) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.save(objectToBeSaved);
		transaction.commit();
		session.close();
	}

	@Override
	public Customer load(CustomerID id) {
		Session session = getSession();
		Customer loadedCustomer = session.get(Customer.class, id);
		if (loadedCustomer==null) {
			return null;
		}
		session.close();
		return loadedCustomer;
	}

	@Override
	public List<Customer> getAll() {
		Session session = getSession();
		List<Customer> list = session.createCriteria(Customer.class).list();
		session.close();
		return list;
	}
	
	@Override
	public void close() {
		sessFact.close();
	}
	
	private Session getSession() {
		return sessFact.openSession();
	}

}
