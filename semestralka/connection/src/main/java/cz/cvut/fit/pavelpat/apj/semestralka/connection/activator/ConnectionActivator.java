package cz.cvut.fit.pavelpat.apj.semestralka.connection.activator;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ConnectionActivator implements BundleActivator{

	private Logger logger = Logger.getLogger(ConnectionActivator.class.getSimpleName());
	
	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("Starting Connection.");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
