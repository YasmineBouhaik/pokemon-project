package com.pokemon.pokemon.project.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PrimaryKeyPokemonDressed implements Serializable {
	
	private Long pokemon_id; 
	private Long dresseur_id;
	
	public Long getPokemon_id() {
		return pokemon_id;
	}
	public void setPokemon_id(Long pokemon_id) {
		this.pokemon_id = pokemon_id;
	}
	public Long getDresseur_id() {
		return dresseur_id;
	}
	public void setDresseur_id(Long dresseur_id) {
		this.dresseur_id = dresseur_id;
	} 
	
}