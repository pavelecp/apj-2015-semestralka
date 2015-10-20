package cz.cvut.fit.pavelpat.apj.semestralka.business;

import java.util.Collection;

import org.testng.Assert;
import org.testng.annotations.Test;

import cz.cvut.fit.pavelpat.apj.semestralka.model.Order;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public class RestaurantsFacadeTest {

  @Test
  public void createOrder() {
	  System.out.println("Create Order");
	  Order order = new Order(new OrderID(1L), "namka", 120);
	  
	  RestaurantsFacade.getRestaurantsFacade().createOrder(order);
	  Collection<Order> allOrders = RestaurantsFacade.getRestaurantsFacade().getAllOrders();
  
	  Assert.assertEquals(allOrders.size(), 1);
	  
  }

}
