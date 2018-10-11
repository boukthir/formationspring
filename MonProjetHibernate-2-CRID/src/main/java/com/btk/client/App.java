package com.btk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.btk.domain.Compte;
public class App {
	public static void main(String[] args) {

		// obtenir la session factory a partir de la configuration

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// obtenir une session a partir de la factory
		Session session = factory.openSession();
		// travailler sur les objts persistant via la session

		Compte compte = session.load(Compte.class, "A1000");
	//	Compte compte = session.get(Compte.class, "A1000");

		
		System.out.println(compte);
		// clore la session
		session.close();
		// clore la factory
		factory.close();
	//System.out.println(compte);
	}
}
