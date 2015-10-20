package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.RestaurantDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Restaurant;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.RestaurantID;

public class RestaurantDefaultDAO implements RestaurantDAOInterface {

	private Map <RestaurantID, Restaurant> map = new HashMap<>();
	
	@Override
	public void save(Restaurant objectToBeSaved) {
		map.put(objectToBeSaved.getId(), objectToBeSaved);
	}

	@Override
	public Restaurant load(RestaurantID id) {
		return map.get(id);
	}

	@Override
	public List<Restaurant> getAll() {
		Collection<Restaurant> values = map.values();
		return (List<Restaurant>) values;
	}

}
