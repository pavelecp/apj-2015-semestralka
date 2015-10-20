package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import java.util.List;

import cz.cvut.fit.pavelpat.apj.semestralka.model.Restaurant;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.RestaurantID;

public interface RestaurantDAOInterface {

	public void save(Restaurant objectToBeSaved);
	public Restaurant load(RestaurantID id);
	public List<Restaurant> getAll();
}
