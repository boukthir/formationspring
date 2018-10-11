package com.btk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.btk.client.ClientConsole;

@SpringBootApplication // une classe de configuration
public class MonProjetSpring5BootApplication {
	@Autowired
	private ClientConsole client;

	
	//demarage du conteneur
	public static void main(String[] args) {

		SpringApplication.run(MonProjetSpring5BootApplication.class, args);
		// ApplicationContext ctxt =

		// ClientConsole client = ctxt.getBean(ClientConsole.class);

		// System.out.println("********* obtenu avec boot le sole est *******
		// :"+client.getBusiness().consulterSolde("C1000"));

	}

	@Bean
	public CommandLineRunner runIt() {

		return args -> {

			System.out.println("********EXECUTE APRES LE DEMARRAGE DE BOOT*****");

			System.out.println(
					"********* obtenu avec boot le sole est *******:" + client.getBusiness().consulterSolde("C1000"));

		};

	}
}
