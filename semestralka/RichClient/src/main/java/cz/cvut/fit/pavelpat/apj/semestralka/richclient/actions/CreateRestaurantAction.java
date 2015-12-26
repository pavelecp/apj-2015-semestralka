package cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions.dialogs.CreateEmployeeDialog;

public class CreateRestaurantAction extends AbstractAction {

	public static CreateRestaurantAction instance = new CreateRestaurantAction();

	private CreateRestaurantAction() {
		super("Create Restaurant");
	}

	@Override
	protected void execute() {
		new CreateEmployeeDialog();
	}

}
