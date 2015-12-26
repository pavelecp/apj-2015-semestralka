package cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.dialogs;

import java.util.Optional;

import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

public abstract class AbstractRestaurantsDialog extends Dialog<ButtonType> {

	public AbstractRestaurantsDialog() {
		this.getDialogPane().setContent(createInterior());
		this.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
		execute();
	}

	protected void execute() {
		Optional<ButtonType> result = this.showAndWait();
		ButtonType buttonType = result.get();
		if (buttonType.getButtonData().isCancelButton()) {
			return;
		} else {
			ok(buttonType);
		}
	}

	protected abstract Node createInterior();

	protected abstract void ok(ButtonType buttonType);

	protected abstract void validate();
	
}
