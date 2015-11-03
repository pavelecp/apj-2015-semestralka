package cz.cvut.fit.pavelpat.apj.semestralka.richclient;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow extends Stage {

	public MainWindow() {
		 Label label = new Label("Main");
		 VBox root = new VBox(label);
		 Scene scene = new Scene(root);
		 setScene(scene);
		 show();
	}

}
