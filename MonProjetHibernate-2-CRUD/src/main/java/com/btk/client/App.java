package com.btk.client;

import org.hibernate.SessionFactory;

import com.btk.utilities.HibernateUtil;

public class App {

	public static void main(String[] args) {


		try(SessionFactory factory = HibernateUtil.getSessionFactory()){
			System.out.println("Demarrage de la session factory");
		}

	}

}
