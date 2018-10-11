package com.btk.client;

import java.math.BigDecimal;

import com.btk.domain.Compte;

/**
 * Hello world!
 *
 */
public class App_Without_Spring 
{
    public static void main( String[] args )
    {
       //le client prend la respensabilite de creer l'objet
    	
    	Compte compte = new Compte("C1000","SALAH",new BigDecimal("1000"));
    	System.out.println( compte );
    }
}
