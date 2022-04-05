package com.pokemon.pokemon.project.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "pokemon_dresse")
public class PokemonDressed {
	
	@EmbeddedId
	private PrimaryKeyPokemonDressed id = new PrimaryKeyPokemonDressed();
	

	@Column(name = "nickname")
	private String nickname;
	
	
	public PokemonDressed(PrimaryKeyPokemonDressed id, Long pokemon_id, Long dresseur_id, String nickname) {
		this.id = id;
		this.nickname = nickname;
	}


	
	public PrimaryKeyPokemonDressed getId() {
		return id;
	}
	
	public void setId(PrimaryKeyPokemonDressed id) {
		this.id = id;
	}
	
//	public Long getPokemon_id() {
//		return pokemon_id;
//	}
//	public void setPokemon_id(Long pokemon_id) {
//		this.pokemon_id = pokemon_id;
//	}
//	public Long getDresseur_id() {
//		return dresseur_id;
//	}
//	public void setDresseur_id(Long dresseur_id) {
//		this.dresseur_id = dresseur_id;
//	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
