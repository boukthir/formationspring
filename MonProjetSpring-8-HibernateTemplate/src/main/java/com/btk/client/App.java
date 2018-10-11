package com.btk.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.btk.domain.Compte;

public class App {

	public static void main(String[] args) {

		// demarrer le conteneur spring

		ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		HibernateTemplate template = ctxt.getBean(HibernateTemplate.class);
		Compte c = template.get(Compte.class, "C3000");
		System.out.println(c);

	}
}
