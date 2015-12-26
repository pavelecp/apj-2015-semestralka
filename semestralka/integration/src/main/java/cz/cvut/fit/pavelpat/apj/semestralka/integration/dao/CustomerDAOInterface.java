package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import java.util.List;

import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Customer;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.CustomerID;

public interface CustomerDAOInterface {

	public void save(Customer objectToBeSaved);
	public Customer load(CustomerID id);
	public List<Customer> getAll();
	public void close();
}
