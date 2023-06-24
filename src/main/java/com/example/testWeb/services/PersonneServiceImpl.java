package com.example.testWeb.services;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testWeb.Exceptions.ageNotValidException;
import com.example.testWeb.entities.Personne;
import com.example.testWeb.repositories.PersonneRepository;

@Service
public class PersonneServiceImpl implements PersonneService {
	
	@Autowired
	private PersonneRepository personneRepository;

	@Override
	public Object addPersonne(Personne p) {
		  LocalDate now = LocalDate.now();
	      int age = Period.between(p.getDateNaissance(), now).getYears();
	      if(age < 150) {
	    	  personneRepository.save(p); 
	    	  return p;
	      }
	      else {
	    	  throw new ageNotValidException("l'age de la personne doit etre inférieur à 150");
	      }
		
	}

	@Override
	public List<Personne> getPersonnes() {
	  
		 List<Personne> personnes = (List<Personne>) personneRepository.findAll();
	        Collections.sort(personnes, Comparator.comparing(Personne::getNom).thenComparing(Personne::getPrenom));
	        return personnes;
	}

}
