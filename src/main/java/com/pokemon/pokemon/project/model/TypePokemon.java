package com.pokemon.pokemon.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_pokemon")
public class TypePokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String label;
	
	public TypePokemon(Long id, String label) {
		//super();
		this.id = id;
		this.label = label;
	}


	public TypePokemon() {
		//super();
	}
	
	public Long getid() {
		return id;
	}
	
	public void setid(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
