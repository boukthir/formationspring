package com.btk.client;

import java.math.BigDecimal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.btk.business.IComptesBusiness;

public class ClientConsole {
	private IComptesBusiness business;

	public IComptesBusiness getBusiness() {
		return business;
	}

	public void setBusiness(IComptesBusiness business) {
		this.business = business;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(ClassPathXmlApplicationContext ctxt =new ClassPathXmlApplicationContext("beans.xml"))
		{
			ClientConsole client = ctxt.getBean(ClientConsole.class);
			BigDecimal sole =client.getBusiness().consulterSolde("C1000");
			System.out.println("le sole est  :"+sole);
		}
		

	}

}
