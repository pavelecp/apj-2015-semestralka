package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.RestaurantDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Address;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Restaurant;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.RestaurantID;

public class RestaurantDefaultDAO implements RestaurantDAOInterface {

	private static long idCounter = 0;
	
	private Map<RestaurantID, Restaurant> map = new HashMap<>();
	private static RestaurantDefaultDAO instance;

	private RestaurantDefaultDAO() {
	}

	public static RestaurantDefaultDAO getInstance() {
		if (instance == null) {
			instance = new RestaurantDefaultDAO();
		}
		return instance;
	}

	@Override
	public void save(Restaurant objectToBeSaved) {
		map.put(objectToBeSaved.getId(), objectToBeSaved);
	}

	@Override
	public Restaurant load(RestaurantID id) {
		return map.get(id);
	}

	@Override
	public Collection<Restaurant> getAll() {
		Collection<Restaurant> values = map.values();
		return values;
	}

	@Override
	public void save(String name, Address address) {
		RestaurantID id = new RestaurantID(idCounter++);
		save(new Restaurant(id, name, address));
	}

}
