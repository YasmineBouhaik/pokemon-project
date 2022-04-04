/*package com.pokemon.pokemon.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pokemon.pokemon.project.exception.ResourceNotFoundException;
import com.pokemon.pokemon.project.model.PokemonDresse;
import com.pokemon.pokemon.project.repository.PokemonDresseRepository;

@RestController
@RequestMapping
public class PokemonDresseController {
	
	@Autowired
	private PokemonDresseRepository pokemondresseRepository;
	
	//GET READ
	
	@GetMapping("/pokemon_dresse")
	public List<PokemonDresse> getAllPokemonDresse(){
		return this.pokemondresseRepository.findAll();
	}
	
	
	//SAVE 
	
	@PostMapping("/pokemon_dresse")
	public PokemonDresse createPokemonDresse(@RequestBody PokemonDresse pokemondresse) {
		return this.pokemondresseRepository.save(pokemondresse);
	}
	
	//GET READ BY ID
	
	@GetMapping("/pokemon_dresse/{dresseur_id}")
    public ResponseEntity<PokemonDresse> getPokemonDresseById(@PathVariable(value = "dresseur_id") Long dresseurId)
    throws ResourceNotFoundException {
        PokemonDresse pokemondresse = pokemondresseRepository.findById(dresseurId)
                .orElseThrow(() -> new ResourceNotFoundException("Pokemon not found for this id :: " + dresseurId));
                return ResponseEntity.ok().body(pokemondresse);
    }
	
	
	
	
	
	
}*/
