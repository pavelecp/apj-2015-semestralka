package cz.cvut.fit.pavelpat.apj.semestralka.connection.activator;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ProtocolActivator implements BundleActivator {

	private Logger logger = Logger.getLogger(ProtocolActivator.class.getSimpleName());

	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("Starting Protocols.");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
