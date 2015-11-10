package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import java.util.Collection;

import cz.cvut.fit.pavelpat.apj.semestralka.model.Address;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Restaurant;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.RestaurantID;

public interface RestaurantDAOInterface {

	public void save(Restaurant objectToBeSaved);
	public Restaurant load(RestaurantID id);
	public Collection<Restaurant> getAll();
	public void save(String name, Address address);
}
