package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import java.util.Collection;

import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Food;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public interface FoodDAOInterface {

	public void save(Food objectToBeSaved);
	public Food load(OrderID id);
	public Collection<Food> getAll();
	public void close();

}
