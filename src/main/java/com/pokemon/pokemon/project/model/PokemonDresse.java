package com.pokemon.pokemon.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "pokemon_dresse")
public class PokemonDresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "pokemon_id")
	private Long pokemon_id;

	@Column (name = "dresseur_id")
	private Long dresseur_id;

	@Column(name = "nickname")
	private String nickname;
	
	
	public PokemonDresse(Long id, Long pokemon_id, Long dresseur_id, String nickname) {
		//super();
		this.id = id;
		this.pokemon_id = pokemon_id;
		this.dresseur_id = dresseur_id;
		this.nickname = nickname;
	}


	public PokemonDresse() {
		//super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}


