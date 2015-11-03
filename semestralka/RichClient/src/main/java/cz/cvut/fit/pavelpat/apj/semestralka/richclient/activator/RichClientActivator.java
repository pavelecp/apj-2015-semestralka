package cz.cvut.fit.pavelpat.apj.semestralka.richclient.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.MainWindow;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class RichClientActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		
		new JFXPanel();
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				new MainWindow();
			}
		});
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
