package cz.cvut.fit.pavelpat.apj.semestralka.business.activator;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class BusinessActivator implements BundleActivator{

	private Logger logger = Logger.getLogger(BusinessActivator.class.getSimpleName());
	
	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("Starting BusinessActivator.");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
