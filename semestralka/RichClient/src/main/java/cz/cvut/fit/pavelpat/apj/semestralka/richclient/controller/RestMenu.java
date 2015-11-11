package cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.CreateRestaurantAction;
import javafx.scene.control.Menu;

public class RestMenu extends Menu {
	
	public RestMenu() {
		super("Restaurants");
		getItems().add(CreateRestaurantAction.instance.createMenuItem());
	}
	
}
