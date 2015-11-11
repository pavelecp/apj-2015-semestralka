package cz.cvut.fit.pavelpat.apj.semestralka.richclient.panels;

import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

import cz.cvut.fit.pavelpat.apj.semestralka.business.RestaurantsFacade;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Restaurant;
import cz.cvut.fit.pavelpat.apj.semestralka.model.id.RestaurantID;
import cz.cvut.fit.pavelpat.apj.semestralka.richclient.observe.RichClientObservable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;

public class RestaurantPanel extends TitledPane implements Observer {

	ObservableList<Restaurant> restaurants = FXCollections.observableArrayList();
	
	public RestaurantPanel() {
		super("Restaurants", null);
		RichClientObservable.getInstance().addObserver(this);
		setContent(createContent());
		refresh();
	}

	private Node createContent() {
		TableView<Restaurant> tab = new TableView<>();
		TableColumn<Restaurant, RestaurantID> nameCol = new TableColumn<>("Name");
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		TableColumn<Restaurant, RestaurantID> addrCol = new TableColumn<>("Address");
		addrCol.setCellValueFactory(new PropertyValueFactory<>("address"));
		tab.getColumns().addAll(nameCol, addrCol);
		tab.setItems(restaurants);
		return tab;
	}
	
	private void refresh() {
		Collection<Restaurant> allRestaurants = RestaurantsFacade.getInstance().getAllRestaurants();
		restaurants.clear();
		restaurants.addAll(allRestaurants);
	}

	@Override
	public void update(Observable o, Object arg) {
		refresh();
	}
}
