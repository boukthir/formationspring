package com.btk.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.btk.domain.Compte;

public class App_With_Spring {

	public static void main(String[] args) {
		

	//Demarrer le conteneur (le contexte) Spring	
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	//Demander l'objet au conteneur
		
		Compte c =context.getBean("compte0",Compte.class);
	//travailler avec l'objet
		
		System.out.println("Obtenir à partir de a factory spring"+ c);
	//Arreter  le conteneur
		
context.close();
	}

}
