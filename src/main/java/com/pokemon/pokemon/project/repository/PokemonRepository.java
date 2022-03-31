package com.pokemon.pokemon.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.pokemon.project.model.Pokemon;


@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
