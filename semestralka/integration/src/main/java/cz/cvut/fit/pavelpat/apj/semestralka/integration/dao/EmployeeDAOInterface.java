package cz.cvut.fit.pavelpat.apj.semestralka.integration.dao;

import java.util.Collection;

import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Employee;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.EmployeeID;

public interface EmployeeDAOInterface {

	public void save(Employee objectToBeSaved);
	public Employee load(EmployeeID id);
	public Collection<Employee> getAll();
	public void close();
}
