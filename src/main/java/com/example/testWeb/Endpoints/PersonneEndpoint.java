package com.example.testWeb.Endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testWeb.entities.Personne;
import com.example.testWeb.services.PersonneService;

@RestController
@RequestMapping("/personne")
public class PersonneEndpoint {
    
	
	@Autowired
	private PersonneService personneService;
	
	// create new Personne
    @PostMapping("/add")
    public Object addPersonne(@RequestBody Personne personne){
       return personneService.addPersonne(personne);
    }
	
    @PostMapping("/get")
    public Object getPersonne(){
       return personneService.getPersonnes();
    }
}
