package com.btk.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btk.business.ICompteBusiness;
import com.btk.domain.Compte;

@RestController
@RequestMapping("/comptes")
public class CompteRestController {
	@Autowired // injection del'objet business de type ICompteBusiness
	private ICompteBusiness business;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping()

	public List<Compte> tousLesComptes() {

		return business.tousLesComptes();

	}

	@PostMapping()

	public ResponseEntity<Compte> ouvrirCompte(@RequestBody Compte c) {

		try {
			business.ouvrirCompte(c);

			return new ResponseEntity<Compte>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block

			logger.error("il ya eu l'execption :...." + e.getMessage());
			return new ResponseEntity<Compte>(c, HttpStatus.CONFLICT);

		}

	}
	
	
	
	
	

}
