package cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller;

import javafx.scene.control.MenuBar;

public class RestMenuBar extends MenuBar {

	public RestMenuBar() {
		getMenus().add(new RestMenu());
	}
}
