package com.btk.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.btk.business.IComptesBusiness;

@Component
public class ClientConsole {
	@Autowired
	private IComptesBusiness business;

	public IComptesBusiness getBusiness() {
		return business;
	}

	public void setBusiness(IComptesBusiness business) {
		this.business = business;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		try (AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(
//				MySpringConfiguration.class)) {
//			ClientConsole client = ctxt.getBean(ClientConsole.class);
//			BigDecimal sole = client.getBusiness().consulterSolde("C1000");
//			System.out.println("le sole est  :" + sole);
//		}
//
//	}

}
