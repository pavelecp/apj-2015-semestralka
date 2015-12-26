package cz.cvut.fit.pavelpat.apj.semestralka.richclient;

import java.util.logging.Logger;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller.menubar.RestMenuBar;
import cz.cvut.fit.pavelpat.apj.semestralka.richclient.panels.EmployeePanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainWindow extends Stage {

	public static MainWindow instance = new MainWindow(null);
	private BundleContext context;
	private RestMenuBar menuBar;
	private EmployeePanel restaurantPanel;
	private Logger logger = Logger.getLogger(MainWindow.class.getName());

	private MainWindow(BundleContext ctx) {
		this.context = ctx;
		this.menuBar = new RestMenuBar();
		this.restaurantPanel = new EmployeePanel();
		setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {
				Bundle f = context.getBundle(0);
				try {
					f.stop();
				} catch (BundleException e) {
					logger.warning("Exception while handling event "+ event.getEventType() +" with error: " + e.getMessage());
				}
			}
		});

		this.setTitle("Restaurant ordering system.");
//		this.setFullScreen(true);
		
		VBox root = new VBox(menuBar, restaurantPanel);
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
		Bundle f = context.getBundle(0);
		try {
			f.stop();
		} catch (BundleException e) {
			logger.warning("Error while exiting application with error: " + e.getMessage());
		}
	}

}
