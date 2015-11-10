package cz.cvut.fit.pavelpat.apj.semestralka.richclient.activator;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.MainWindow;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class RichClientActivator implements BundleActivator {

	private static Logger LOG = Logger.getLogger(RichClientActivator.class.getName());
	
	@Override
	public void start(BundleContext context) throws Exception {
		LOG.info("Starting rich client");
		new JFXPanel();
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				MainWindow.instance.setContext(context);
			}
		});
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		LOG.info("Stopping rich client");
	}

}
