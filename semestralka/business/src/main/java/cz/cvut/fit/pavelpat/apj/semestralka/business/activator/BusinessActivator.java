package cz.cvut.fit.pavelpat.apj.semestralka.business.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessActivator implements BundleActivator{

	private Logger logger = LoggerFactory.getLogger(BusinessActivator.class.getSimpleName());
	
	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("Starting BusinessActivator.");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
