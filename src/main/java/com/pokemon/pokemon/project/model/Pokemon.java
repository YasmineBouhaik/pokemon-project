package com.pokemon.pokemon.project.model;

import javax.persistence.Column;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "pokemon")
public class Pokemon {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "number_")
	private Integer number_;
	
	@Column(name = "name_")
	private String name_;
	
	@Column(name = "health_points")
	private Integer health_points;
	
	@Column(name = "evolution")
	private Long evolution;
	
	

  	@ManyToMany
    @JoinTable( name = "pokemon_dresse",
                joinColumns = @JoinColumn( name = "pokemon_id" ),
                inverseJoinColumns = @JoinColumn( name = "dresseur_id" ) )
    private List<Dresseur> dresseurs = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumber_() {
		return number_;
	}
	public void setNumber_(Integer number_) {
		this.number_ = number_;
	}
	public String getName_() {
		return name_;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
	public Integer getHealth_points() {
		return health_points;
	}
	public void setHealth_points(Integer health_points) {
		this.health_points = health_points;
	}
	public Long getEvolution() {
		return evolution;
	}
	public void setEvolution(Long evolution) {
		this.evolution = evolution;
	}
}



