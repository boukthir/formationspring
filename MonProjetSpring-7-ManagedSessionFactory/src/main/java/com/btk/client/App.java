package com.btk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.btk.domain.Compte;

public class App {
	public static void main(String[] args) {

		// demarrer le conteneur spring

		ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");

		 // obtenir la session factory a partir de la configuration
		
		try (SessionFactory factory = ctxt.getBean(SessionFactory.class)) {

			// // obtenir une session a partir de la factory
			Session session = factory.openSession();
			// // travailler sur les objts persistant via la session
			//
			// Compte compte = session.load(Compte.class, "A1000");
			Compte compte = session.get(Compte.class, "A1000");
			//Compte compte1 = session.get(Compte.class, "B2000");
			
			System.out.println(compte);
			//System.out.println(compte1);

			
			// clore la session
			session.close();
			
			 // clore la factory
			factory.close();
			//System.out.println(compte);
			//System.out.println(compte1);

		}
	}
}
