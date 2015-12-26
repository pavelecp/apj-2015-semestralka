package cz.cvut.fit.pavelpat.apj.semestralka.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Food {

	private long id;
	private String foodName;
	private double foodPrice;
	
	public Food() {
	}
	
	public Food(String foodName, double foodPrice) {
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

}
