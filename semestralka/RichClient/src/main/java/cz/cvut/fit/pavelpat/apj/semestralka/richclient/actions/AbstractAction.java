package cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;

public abstract class AbstractAction {

	protected String name;

	public AbstractAction(String string) {
		this.name = string;
	}

	protected abstract void execute();

	public MenuItem createMenuItem() {
		MenuItem menuItem = new MenuItem(name);
		menuItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				execute();
			}
		});
		return menuItem;
	}

}
