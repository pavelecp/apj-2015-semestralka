package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.FoodDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Food;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public class OrderDefaultDAO implements FoodDAOInterface {

	private static OrderDefaultDAO instance = null;
	private Map<Long, Food> map = new HashMap<>();
	private static long counter = 0;
	
	public static OrderDefaultDAO getInstance() {
		if (instance == null) {
			instance = new OrderDefaultDAO();
		}
		return instance;
	}

	private OrderDefaultDAO() {
	}
	
	@Override
	public void save(Food objectToBeSaved) {
		objectToBeSaved.setId(counter++);
		map.put(objectToBeSaved.getId(), objectToBeSaved);
	}

	@Override
	public Food load(OrderID id) {
		return map.get(id);
	}

	@Override
	public Collection<Food> getAll() {
		Collection<Food> values = map.values();
		return values;
	}

	@Override
	public void close() {
	}
	
}
