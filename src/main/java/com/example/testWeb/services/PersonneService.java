package com.example.testWeb.services;

import java.util.List;

import com.example.testWeb.entities.Personne;

public interface PersonneService {
	
	Object addPersonne(Personne p);
	List<Personne> getPersonnes();

}
