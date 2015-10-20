package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import java.util.Collection;

import cz.cvut.fit.pavelpat.apj.semestralka.model.Order;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public interface OrderDAOInterface {

	public void save(Order objectToBeSaved);
	public Order load(OrderID id);
	public Collection<Order> getAll();
}
