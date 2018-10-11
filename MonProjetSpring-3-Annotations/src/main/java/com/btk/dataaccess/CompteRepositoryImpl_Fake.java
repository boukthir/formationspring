package com.btk.dataaccess;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.btk.domain.Compte;

@Repository
public class CompteRepositoryImpl_Fake implements ICompteRepository {

	@Override
	public void create(Compte c) {

	}

	@Override
	public Compte findById(String id) {
		
		return new Compte ("C3000","Boukthir SAMHOUN",new BigDecimal("1000"));
		
		
	}

	@Override
	public List<Compte> findAll() {
		return null;
	}

	@Override
	public Compte update(Compte c) {
		return null;
	}

	@Override
	public void delete(String id) {

	}

}
