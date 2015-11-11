package cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.ExitAction;
import javafx.scene.control.Menu;

public class FileMenu extends Menu {

	public FileMenu() {
		super("File");
		getItems().add(ExitAction.instance.createMenuItem());
	}
}
