package cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.activator;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import cz.cvut.fit.pavelpat.apj.semestralka.integration.dao.DAOFactory;
import cz.cvut.fit.pavelpat.apj.semestralka.postgreSQLDB.dao.PostgreSQLDAOFactory;

public class PostgreSQLDBActivator implements BundleActivator {

	private static final Logger LOG = Logger.getLogger(PostgreSQLDBActivator.class.getSimpleName());
	
	@Override
	public void start(BundleContext context) throws Exception {
		LOG.info("Starting postresql activator.");
		PostgreSQLDAOFactory postgresqlDAOFactory = new PostgreSQLDAOFactory();
		context.registerService(DAOFactory.class, postgresqlDAOFactory, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
	}

}
