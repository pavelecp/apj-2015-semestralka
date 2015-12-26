package cz.cvut.fit.pavelpat.apj.semestralka.integration.activator;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;

public class IntegrationActivator implements BundleActivator {

	Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("Starting IntegrationActivator");
		ServiceTracker<DAOFactory, DAOFactory> st = new ServiceTracker<>(context, DAOFactory.class.getName(), null);
		st.open();
		DAOFactory.setTracker(st);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
