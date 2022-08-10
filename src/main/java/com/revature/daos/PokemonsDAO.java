package com.revature.daos;

import java.util.List;

import com.revature.models.Pokemons;

public interface PokemonsDAO {
	
	Pokemons getPokemonByPersona (String pokePersona);
	
	List<Pokemons>getAllPokemon();

}
