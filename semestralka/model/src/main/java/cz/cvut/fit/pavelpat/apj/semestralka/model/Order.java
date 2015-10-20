package cz.cvut.fit.pavelpat.apj.semestralka.model;

import cz.cvut.fit.pavelpat.apj.semestralka.model.id.OrderID;

public class Order {

	private final OrderID id;
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public OrderID getId() {
		return id;
	}

	private String foodName;
	private double foodPrice;

	public Order(OrderID id, String foodName, double foodPrice) {
		this.id = id;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

}
