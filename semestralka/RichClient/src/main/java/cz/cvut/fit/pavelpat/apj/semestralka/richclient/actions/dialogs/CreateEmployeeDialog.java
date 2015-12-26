package cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.dialogs;

import cz.cvut.fit.pavelpat.apj.semestralka.business.RestaurantSystemFacade;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Address;
import cz.cvut.fit.pavelpat.apj.semestralka.model.entity.Employee;
import cz.cvut.fit.pavelpat.apj.semestralka.richclient.observe.RichClientObservable;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CreateEmployeeDialog extends AbstractRestaurantsDialog {

	private GridPane pane;
	private TextField name;
	private TextField city;
	private TextField street;
	private TextField postNum;

	public CreateEmployeeDialog() {
		super();
	}

	@Override
	protected Node createInterior() {
		setUpTextFields();
		pane = new GridPane();
		this.setHeaderText("Please enter the employee information.");
		this.setResizable(true);
		pane.add(new Label("Name:"), 1, 1);
		pane.add(name, 2, 1);
		pane.add(new Label("City:"), 1, 2);
		pane.add(city, 2, 2);
		pane.add(new Label("Street:"), 1, 3);
		pane.add(street, 2, 3);
		pane.add(new Label("Postal Num.:"), 1, 4);
		pane.add(postNum, 2, 4);
		return pane;
	}

	@Override
	protected void ok(ButtonType buttonType) {
		String tmpName = name.getText();
		Address tmpAddress = new Address(city.getText(), street.getText(), Integer.parseInt(postNum.getText()));
		RestaurantSystemFacade.getInstance().createEmployee(new Employee(tmpName, tmpAddress));
		RichClientObservable.getInstance().notifyObservers();
	}

	@Override
	protected void validate() {
		// TODO Auto-generated method stub
	}

	private void setUpTextFields() {
		name = new TextField();
		city = new TextField();
		street = new TextField();
		postNum = new TextField();

	}
}
