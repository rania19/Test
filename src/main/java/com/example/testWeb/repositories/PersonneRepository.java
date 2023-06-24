package com.example.testWeb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.testWeb.entities.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long> {

}
