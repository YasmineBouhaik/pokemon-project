package com.pokemon.pokemon.project.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;



@Entity
@Table(name = "pokemon_est_de_type")
public class PokemonEstDeType {
	
	@EmbeddedId
	private PrimaryKeyPokemonEstDeType id = new PrimaryKeyPokemonEstDeType();
	
	
	public PokemonEstDeType(PrimaryKeyPokemonEstDeType id, Long pokemon_id, Long type_id) {
		//super();
		this.id = id;
	}

	public PokemonEstDeType() {
		//super();
	}
	
	public PrimaryKeyPokemonEstDeType getId() {
		return id;
	}
	
	public void setId(PrimaryKeyPokemonEstDeType id) {
		this.id = id;
	}
	
}
