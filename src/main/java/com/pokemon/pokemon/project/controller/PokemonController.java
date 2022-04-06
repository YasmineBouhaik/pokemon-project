package com.pokemon.pokemon.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.project.exception.ResourceNotFoundException;
import com.pokemon.pokemon.project.model.Pokemon;
import com.pokemon.pokemon.project.repository.PokemonRepository;


@RestController
@RequestMapping 
public class PokemonController {
	
	@Autowired
	private PokemonRepository pokemonRepository;
	
	//GET READ
	@CrossOrigin(allowedHeaders = "http://localhost:8080")
	@GetMapping("/pokemon")
	public List<Pokemon> getAllPokemon(){
		return this.pokemonRepository.findAll();
	}
	
	
	
	//GET READ BY ID
	
	@GetMapping("/pokemon/{id}")
    public ResponseEntity<Pokemon> getPokemonById(@PathVariable(value = "id") Long pokemonId)
    throws ResourceNotFoundException {
        Pokemon pokemon = pokemonRepository.findById(pokemonId)
                .orElseThrow(() -> new ResourceNotFoundException("Pokemon not found for this id :: " + pokemonId));
                return ResponseEntity.ok().body(pokemon);
    }
	
	//SAVE
	
	@PostMapping("/pokemon")
	public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
		return this.pokemonRepository.save(pokemon);
	}
	
	//UPDATE
	
	@PutMapping("pokemon/{id}")
	public ResponseEntity<Pokemon> updatePokemon(@PathVariable(value = "id") Long pokemonId, 
			@RequestBody Pokemon pokemonDetails) throws ResourceNotFoundException {
		
		Pokemon pokemon = pokemonRepository.findById(pokemonId)
				.orElseThrow(() -> new ResourceNotFoundException("Pokemon not found for this id :: " + pokemonId));
		
		pokemon.setNumber_(pokemonDetails.getNumber_());
		pokemon.setName_(pokemonDetails.getName_());
		pokemon.setHealth_points(pokemonDetails.getHealth_points());
		pokemon.setEvolution(pokemonDetails.getEvolution());
		
		return ResponseEntity.ok(this.pokemonRepository.save(pokemon));
		
	}
	
	//DELETE
	
	@DeleteMapping("pokemon/{id}")
	public Map<String, Boolean> deletePokemon(@PathVariable(value = "id") Long pokemonId) throws ResourceNotFoundException {
		Pokemon pokemon = pokemonRepository.findById(pokemonId)
                .orElseThrow(() -> new ResourceNotFoundException("Pokemon not found for this id :: " + pokemonId));
                
        this.pokemonRepository.delete(pokemon);
        
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        
        return response;
		
	}
	
}
