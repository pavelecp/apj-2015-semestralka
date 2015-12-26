package cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.dao.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.EmployeeDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Employee;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.EmployeeID;

public class EmployeeDAO implements EmployeeDAOInterface {

	private static EmployeeDAO instance;
	private SessionFactory sessFact;
	
	private EmployeeDAO(SessionFactory sessFact) {
		this.sessFact = sessFact;
	}
	
	public static EmployeeDAO getInstance(SessionFactory sessFact) {
		if (instance == null) {
			instance = new EmployeeDAO(sessFact);
		}
		return instance;
	}

	@Override
	public void save(Employee objectToBeSaved) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.save(objectToBeSaved);
		transaction.commit();
		session.close();
	}

	@Override
	public Employee load(EmployeeID id) {
		Session session = getSession();
		Employee laodedEmployee = session.get(Employee.class, id);
		if (laodedEmployee==null) {
			return null;
		}
		session.close();
		return laodedEmployee;
	}

	@Override
	public Collection<Employee> getAll() {
		Session session = getSession();
		List<Employee> list = session.createCriteria(Employee.class).list();
		session.close();
		return list;
	}
	
	private Session getSession() {
		return sessFact.openSession();
	}
	
	@Override
	public void close() {
		sessFact.close();
	}

}
