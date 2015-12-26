package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.EmployeeDAOInterface;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Employee;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.EmployeeID;

public class EmployeeDefaultDAO implements EmployeeDAOInterface {

	private Map<Long, Employee> map = new HashMap<>();
	private static EmployeeDefaultDAO instance;
	private static long counter = 0;

	
	private EmployeeDefaultDAO() {
	}

	public static EmployeeDefaultDAO getInstance() {
		if (instance == null) {
			instance = new EmployeeDefaultDAO();
		}
		return instance;
	}

	@Override
	public void save(Employee objectToBeSaved) {
		objectToBeSaved.setId(counter++);
		map.put(objectToBeSaved.getId(), objectToBeSaved);
	}

	@Override
	public Employee load(EmployeeID id) {
		return map.get(id);
	}

	@Override
	public Collection<Employee> getAll() {
		Collection<Employee> values = map.values();
		return values;
	}
	
	@Override
	public void close() {
	}

}
