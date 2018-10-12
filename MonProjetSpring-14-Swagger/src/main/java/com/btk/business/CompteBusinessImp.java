package com.btk.business;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btk.domain.Compte;
import com.btk.repository.ICompteRepository;

@Service // classe de service
public class CompteBusinessImp implements ICompteBusiness {

	@Autowired
	private ICompteRepository repository;

	@Override
	public void ouvrirCompte(Compte c) {

		repository.save(c);

	}

	@Override
	public List<Compte> tousLesComptes() {

		return repository.findAll();
	}

	@Override
	public BigDecimal consulterSolde(String numero) {
		// BigDecimal indefini =new BigDecimal(Long.MAX_VALUE);
		Optional<Compte> resultat = repository.findById(numero);

		return resultat.isPresent() ? resultat.get().getSolde() : BigDecimal.ZERO;
	}

	@Override
	public void cloturerCompte(String numero) {

		Optional<Compte> resultat = repository.findById(numero);
		if (resultat.isPresent()) {
			repository.delete(resultat.get());
		}

	}

}
