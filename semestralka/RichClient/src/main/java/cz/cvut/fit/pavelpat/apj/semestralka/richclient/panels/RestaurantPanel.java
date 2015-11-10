package cz.cvut.fit.pavelpat.apj.semestralka.richclient.panels;

import cz.cvut.fit.pavelpat.apj.semestralka.business.RestaurantsFacade;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Restaurant;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;

public class RestaurantPanel extends TitledPane {

	public RestaurantPanel() {
		super("Restaurants", createContent());
	}

	private static Node createContent() {
		TableView<Restaurant> tab = new TableView<>();
		// TODO
		return null;
	}
	
	private void refresh() {
		//TODO
		RestaurantsFacade.getInstance().getAllOrders();
	}
}
