package cz.cvut.fit.pavelpat.apj.semestralka.connection.command;

import java.io.Serializable;

import cz.cvut.fit.pavelpat.apj.semestralka.business.RestaurantSystemFacade;
import cz.cvut.fit.pavelpat.apj.semestralka.utils.RestaurantsException;

@SuppressWarnings("serial") 
public abstract class Command implements Serializable {

	public static final String OK = "ok";

	public abstract Object execute(RestaurantSystemFacade f) throws RestaurantsException;

}
