package com.pokemon.pokemon.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.project.model.PokemonDresse;
import com.pokemon.pokemon.project.repository.PokemonDressRepository;

@RestController
@RequestMapping
public class PokemonDressController {
	
	@Autowired
	private PokemonDressRepository pokemonDressRepository;
	
	@GetMapping("/pokemondress")
	public List<PokemonDresse> getAllPokemonDress() {
		return this.pokemonDressRepository.findAll();
	}
	
	
	@PostMapping("/pokemondress")
	public PokemonDresse createPokemonDress(@RequestBody PokemonDresse pokemondress) {
		return this.pokemonDressRepository.save(pokemondress);
	}

}
