package cz.cvut.fit.pavelpat.apj.semestralka.richclient.panels;

import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

import cz.cvut.fit.pavelpat.apj.semestralka.business.RestaurantSystemFacade;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Address;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Employee;
import cz.cvut.fit.pavelpat.apj.semestralka.richclient.observe.RichClientObservable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeePanel extends TitledPane implements Observer {

	ObservableList<Employee> restaurants = FXCollections.observableArrayList();
	
	public EmployeePanel() {
		super("Restaurants", null);
		RichClientObservable.getInstance().addObserver(this);
		setContent(createContent());
		refresh();
	}

	private Node createContent() {
		TableView<Employee> tab = new TableView<>();
		TableColumn<Employee, String> nameCol = new TableColumn<>("Name");
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		TableColumn<Employee, Address> addrCol = new TableColumn<>("Address");
		addrCol.setCellValueFactory(new PropertyValueFactory<>("address"));
		tab.getColumns().addAll(nameCol, addrCol);
		tab.setItems(restaurants);
		return tab;
	}
	
	private void refresh() {
		Collection<Employee> allRestaurants = RestaurantSystemFacade.getInstance().getAllEmployees();
		restaurants.clear();
		restaurants.addAll(allRestaurants);
	}

	@Override
	public void update(Observable o, Object arg) {
		refresh();
	}
}
