package com.pokemon.pokemon.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pokemon.pokemon.project.model.TypePokemon;

@Repository
public interface PokemonEstDeTypeRepository extends JpaRepository<TypePokemon, Long> {

}
