package com.btk.business;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btk.dataaccess.ICompteRepository;
import com.btk.domain.Compte;
@Service
public class ComptesBusinessImpl implements IComptesBusiness {

	@Autowired
	private ICompteRepository repository;

	public ICompteRepository getRepository() {
		return repository;
	}

	public void setRepository(ICompteRepository repository) {
		this.repository = repository;
	}

	@Override
	public BigDecimal consulterSolde(String numero) {

		// simulon une régle de gestion qui dit que les comptes dont le numero commence
		// par un C auront 10% de puls dans leur solde

		Compte compte = repository.findById(numero);

		return (compte.getNumero().startsWith("C")) ? compte.getSolde().multiply(new BigDecimal("1.1"))
				: compte.getSolde();

	}

}
