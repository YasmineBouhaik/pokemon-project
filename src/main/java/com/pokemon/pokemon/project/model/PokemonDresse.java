package com.pokemon.pokemon.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon_dresse")
public class PokemonDresse {
	@Id
	@Column (name= "pokemon_id")
	private Long pokemon_id;
	
	@Column (name= "dresseur_id")
	private Long dresseur_id;

	@Column (name= "nickname")
	private String nickname;

	
	public PokemonDresse() {
		super();
	}
	public PokemonDresse(Long pokemon_id,
			Long dresseur_id, String nickname) {
		super();
		this.pokemon_id = pokemon_id;
		this.dresseur_id = dresseur_id;
		this.nickname = nickname;
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