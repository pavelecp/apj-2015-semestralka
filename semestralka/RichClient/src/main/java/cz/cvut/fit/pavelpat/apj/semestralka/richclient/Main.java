package cz.cvut.fit.pavelpat.apj.semestralka.richclient;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class Main {

	public static void main(String[] args) {
		new JFXPanel();
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				MainWindow.instance.setContext(null);
			}
		});
	}
}
