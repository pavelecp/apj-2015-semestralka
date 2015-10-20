package cz.cvut.fit.pavelpat.apj.semestralka.integration.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegrationActivator implements BundleActivator {

	private Logger logger = LoggerFactory.getLogger(IntegrationActivator.class.getSimpleName());
		
	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("Starting IntegrationActivator");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
