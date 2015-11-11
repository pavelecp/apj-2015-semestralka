package cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.dialogs;

import java.util.Optional;

import cz.cvut.fit.pavelpat.apj.semestralka.business.RestaurantsFacade;
import cz.cvut.fit.pavelpat.apj.semestralka.model.Address;
import cz.cvut.fit.pavelpat.apj.semestralka.richclient.observe.RichClientObservable;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CreateRestaurantDialog extends Dialog<ButtonType> {

	private GridPane pane;
	private TextField name;
	private TextField city;
	private TextField street;
	private TextField postNum;

	public CreateRestaurantDialog() {
		this.getDialogPane().setContent(createInterior());
		this.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
		execute();
	}

	private void setUpTextFields() {
		name = new TextField();
		city = new TextField();
		street = new TextField();
		postNum = new TextField();
	}

	private Node createInterior() {
		setUpTextFields();
		pane = new GridPane();
		this.setHeaderText("Please enter the restaurant properties.");
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

	public void execute() {
		Optional<ButtonType> result = this.showAndWait();
		ButtonType buttonType = result.get();
		if (buttonType.getButtonData().isCancelButton()) {
			return;
		} else {
			done(buttonType);
		}
	}

	private void done(ButtonType buttonType) {
		String tmpName = name.getText();
		Address tmpAddress = new Address(city.getText(), street.getText(), Integer.parseInt(postNum.getText()));
		RestaurantsFacade.getInstance().createRestaurant(tmpName, tmpAddress);
		RichClientObservable.getInstance().notifyObservers();
	}
}
