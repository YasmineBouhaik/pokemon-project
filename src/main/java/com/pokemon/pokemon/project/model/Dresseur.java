package com.pokemon.pokemon.project.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


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
	public void setPokemon(Set<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	
}
