package cz.cvut.fit.pavelpat.apj.semestralka.richclient;

import java.util.logging.Logger;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.launch.Framework;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller.RestMenuBar;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainWindow extends Stage {

	public static MainWindow instance = new MainWindow(null);
	private BundleContext context;
	private RestMenuBar menuBar;

	private MainWindow(BundleContext ctx) {
		this.context = ctx;
		this.menuBar = new RestMenuBar();
		setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {
				Framework f = (Framework) context.getBundle();
				try {
					f.stop();
					f.waitForStop(3000);
				} catch (BundleException | InterruptedException e) {
					Logger.getLogger(MainWindow.class.getName()).info("error message");
				}
			}
		});

		// Label label = new Label("Main");
		VBox root = new VBox(menuBar);
		Scene scene = new Scene(root);
		setScene(scene);
		show();
	}

	public BundleContext getContext() {
		return context;
	}

	public void setContext(BundleContext context) {
		this.context = context;
	}

	public void stop() {
	}

}
