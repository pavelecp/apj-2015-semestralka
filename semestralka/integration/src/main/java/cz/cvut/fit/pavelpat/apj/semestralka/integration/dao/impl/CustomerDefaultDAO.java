package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.CustomerDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Customer;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.CustomerID;

public class CustomerDefaultDAO implements CustomerDAOInterface {

	private Map <CustomerID, Customer> map = new HashMap<>();
	
	public void save(Customer objectToBeSaved) {
		map.put(objectToBeSaved.getId(), objectToBeSaved);
	}

	public Customer load(CustomerID id) {
		return map.get(id);
	}

	@Override
	public List<Customer> getAll() {
		Collection<Customer> values = map.values();
		return (List<Customer>) values;
	}
	
}
