package cz.cvut.fit.pavelpat.apj.semestralka.model.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelActivator implements BundleActivator  {
	
	private Logger logger = LoggerFactory.getLogger(ModelActivator.class.getSimpleName());
	
	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("Starting ModelActivator");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
