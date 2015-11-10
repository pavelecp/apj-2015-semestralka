package cz.cvut.fit.pavelpat.apj.semestralka.richclient.actions;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.MainWindow;

public class ExitAction extends AbstractAction {

	public static AbstractAction instance = new ExitAction();
	
	private ExitAction() {
		super("Exit");
	}
	
	@Override
	protected void execute() {
		MainWindow.instance.stop();
	}
}
