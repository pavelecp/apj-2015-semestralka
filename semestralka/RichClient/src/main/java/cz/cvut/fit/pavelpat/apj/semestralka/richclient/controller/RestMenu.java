package cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.ExitAction;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class RestMenu extends Menu {
	
	public RestMenu() {
		super("RestMenu");
		getItems().add(ExitAction.instance.createMenuItem());
	}
	
	
	
}
