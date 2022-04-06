package com.pokemon.pokemon.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.project.exception.ResourceNotFoundException;
import com.pokemon.pokemon.project.model.TypePokemon;
import com.pokemon.pokemon.project.repository.TypePokemonRepository;

@RestController
@RequestMapping
public class TypePokemonController {
	
	@Autowired
	private TypePokemonRepository typepokemonRepository;
	
	//GET READ
	@CrossOrigin(allowedHeaders = "http://localhost:8080")
	@GetMapping("/type_pokemon")
	public List<TypePokemon> getAllTypePokemon(){
		return this.typepokemonRepository.findAll();
	}
	
	//GET READ BY ID
	
	@GetMapping("/type_pokemon/{id}")
	public ResponseEntity<TypePokemon> getTypePokemonById(@PathVariable(value = "id") Long typepokemonId)
	  throws ResourceNotFoundException {
	      TypePokemon typepokemon = typepokemonRepository.findById(typepokemonId)
	              .orElseThrow(() -> new ResourceNotFoundException("Pokemon not found for this id :: " + typepokemonId));
	              return ResponseEntity.ok().body(typepokemon);
	}
	
	
}
