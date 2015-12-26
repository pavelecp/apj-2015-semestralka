package cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.dao.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.FoodDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Food;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public class OrderDAO implements FoodDAOInterface {

	private static OrderDAO instance;
	private SessionFactory sessFact;
	
	private OrderDAO(SessionFactory sessFact) {
		this.sessFact = sessFact;
	}
	
	public static OrderDAO getInstance(SessionFactory sessFact) {
		if (instance == null) {
			instance = new OrderDAO(sessFact);
		}
		return instance;
	}

	@Override
	public void save(Food objectToBeSaved) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.save(objectToBeSaved);
		transaction.commit();
		session.close();
	}

	@Override
	public Food load(OrderID id) {
		Session session = getSession();
		Food loadedOrder = session.get(Food.class, id);
		session.close();
		return loadedOrder;
	}

	@Override
	public Collection<Food> getAll() {
		Session session = getSession();
		List<Food> list = session.createCriteria(Food.class).list();
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
