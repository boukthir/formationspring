package com.btk.utilities;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static  SessionFactory factory;
	
	static {// THIS ensures that our session factory is a singleton
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.out.println("LOG -Attention, il ya eu l'exception" + e + "lors de la creation du factory");
		}

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

}
