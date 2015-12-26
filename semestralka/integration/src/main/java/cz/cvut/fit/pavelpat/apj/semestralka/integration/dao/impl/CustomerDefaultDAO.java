package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.CustomerDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Customer;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.CustomerID;

public class CustomerDefaultDAO implements CustomerDAOInterface {

	private Map<Long, Customer> map = new HashMap<>();
	private static CustomerDefaultDAO instance;
	private static long counter = 0;
	
	private CustomerDefaultDAO() {
	}

	public static CustomerDefaultDAO getInstance() {
		if (instance == null) {
			instance = new CustomerDefaultDAO();
		}
		return instance;
	}

	public void save(Customer objectToBeSaved) {
		objectToBeSaved.setId(counter++);
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
	
	@Override
	public void close() {
	}

}
