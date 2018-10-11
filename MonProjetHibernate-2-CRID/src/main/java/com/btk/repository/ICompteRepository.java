package com.btk.repository;

import java.util.List;

import com.btk.domain.Compte;

public interface ICompteRepository {

	// CRUD Contract

	void create(Compte c);

	Compte findById(String id);

	List<Compte> findAll();

	Compte update(Compte c);

	void delete(String id);

}
