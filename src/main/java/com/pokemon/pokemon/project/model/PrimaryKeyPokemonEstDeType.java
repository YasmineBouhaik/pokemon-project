package com.pokemon.pokemon.project.model;

import java.io.Serializable;

public class PrimaryKeyPokemonEstDeType implements Serializable {

	private Long pokemon_id; 
	private Long type_id;
	
	public Long getPokemon_id() {
		return pokemon_id;
	}
	public void setPokemon_id(Long pokemon_id) {
		this.pokemon_id = pokemon_id;
	}
	public Long getType_id() {
		return type_id;
	}
	public void setType_id(Long type_id) {
		this.type_id = type_id;
	} 
}
