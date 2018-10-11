package com.btk.service;

import org.springframework.stereotype.Service;

@Service
public class Calcul {
	public int additionne(int a, int b) {

		//System.out.println(">>>>>LOG :  A l'entrée de Additionner");
		int res = a + b;
		//System.out.println(">>>>>LOG :  A la sortie de Additionner");
		return res;

	}

	public int diviser(int a, int b) {
	//	System.out.println(">>>>>LOG :  A l'entrée de diviser");
		int res = a / b;

	//	System.out.println(">>>>>LOG :  A la sortie de diviser");

		return res;

	}

}
