package com.btk.repository;

import java.util.List;

import org.hibernate.Session;

import com.btk.domain.Compte;
import com.btk.utilities.HibernateUtil;

public class CompteRepositoryImpl_Hibernate implements ICompteRepository {

	@Override
	public void create(Compte c) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public Compte findById(String id) {
		// TODO Auto-generated method stub
		
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
		
		return session.get(Compte.class, id);
		}
	}

	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte update(Compte c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
