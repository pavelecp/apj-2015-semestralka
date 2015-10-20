package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import java.util.List;

import cz.cvut.fit.pavelpat.apj.semestralka.model.Order;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public interface OrderDAOFactory {

	public void save(Order objectToBeSaved);
	public Order load(OrderID id);
	public List<Order> getAll();
}
