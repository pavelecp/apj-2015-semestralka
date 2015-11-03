package cz.cvut.fit.pavelpat.apj.semestralka.integration.activator;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class IntegrationActivator implements BundleActivator {

	Logger logger = Logger.getLogger(this.getClass().getName());	
	
	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("Starting IntegrationActivator");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
