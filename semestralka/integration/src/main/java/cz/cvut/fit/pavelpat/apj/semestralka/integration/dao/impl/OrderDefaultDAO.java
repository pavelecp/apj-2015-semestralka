package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.OrderDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Order;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public class OrderDefaultDAO implements OrderDAOInterface {

	private static OrderDefaultDAO instance = null;

	public static OrderDefaultDAO getInstance() {
		if (instance == null) {
			instance = new OrderDefaultDAO();
		}
		return instance;
	}

	private OrderDefaultDAO() {

	}

	private Map<OrderID, Order> map = new HashMap<>();

	@Override
	public void save(Order objectToBeSaved) {
		map.put(objectToBeSaved.getId(), objectToBeSaved);
	}

	@Override
	public Order load(OrderID id) {
		return map.get(id);
	}

	@Override
	public Collection<Order> getAll() {
		Collection<Order> values = map.values();
		return values;
	}

}
