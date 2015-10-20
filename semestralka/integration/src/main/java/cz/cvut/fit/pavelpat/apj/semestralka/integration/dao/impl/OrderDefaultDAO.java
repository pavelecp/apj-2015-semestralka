package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.OrderDAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Order;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public class OrderDefaultDAO implements OrderDAOFactory {

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
	public List<Order> getAll() {
		Collection<Order> values = map.values();
		return (List<Order>) values;
	}


}
