package cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.CreateRestaurantAction;
import cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.ExitAction;
import javafx.scene.control.Menu;

public class RestMenu extends Menu {
	
	public RestMenu() {
		super("RestMenu");
		getItems().add(ExitAction.instance.createMenuItem());
		getItems().add(CreateRestaurantAction.instance.createMenuItem());
	}
	
	
	
}
