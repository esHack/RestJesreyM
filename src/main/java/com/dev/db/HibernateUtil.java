package com.dev.db;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal();
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
		
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}

		return sessionFactory;
	}
	
	
	
	
	public static Session getSession() throws HibernateException {
	    Session session = threadLocal.get();

	    if (session == null || !session.isOpen()) {
	      if (sessionFactory == null) {
	        rebuildSessionFactory();
	      }
	      session = (sessionFactory != null) ? sessionFactory.openSession() : null;
	      threadLocal.set(session);
	    }

	    return session;
	  }

	  public static void rebuildSessionFactory() {
	    try {
	      sessionFactory = getSessionFactory();
	    } catch (Exception e) {
	      System.err.println("%%%% Error Creating SessionFactory %%%%");
	      e.printStackTrace();
	    }
	  }

	  public static void closeSession() throws HibernateException {
	    Session session = (Session) threadLocal.get();
	    threadLocal.set(null);

	    if (session != null) {
	      session.close();
	    }
	  }
}