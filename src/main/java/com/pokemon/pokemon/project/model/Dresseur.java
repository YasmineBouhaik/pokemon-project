package com.pokemon.pokemon.project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dresseur")
public class Dresseur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "pokemon_dresse",
			joinColumns = { @JoinColumn(name = "dresseur_id")},
			inverseJoinColumns = { @JoinColumn(name = "pokemon_id")})
	
	private Set<Pokemon> pokemon = new HashSet<>();
	

	@Column(name = "name_")
	private String name_;
	
	@Column(name = "ville")
	private String ville;
	
	@Column(name = "nickname")
	private String nickname;
	
	
	public Dresseur(String name_, String ville, String nickname) {
		super();
		this.name_ = name_;
		this.ville = ville;
	}



	public Dresseur() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName_() {
		return name_;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


	public Set<Pokemon> getPokemon() {
		return pokemon;
	}
	
	public Set<Pokemon> setPokemon() {
		return pokemon;
	}
	


	public void Pokemon(Pokemon pokemon) {
		pokemon.add(pokemon);
	}


	
	
}
