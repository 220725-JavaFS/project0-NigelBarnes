package com.revature.services;

import java.util.List;

import com.revature.daos.PokemonsDAO;
import com.revature.daos.PokemonsDAOImpl;
import com.revature.models.Pokemons;

public class PokemonsService {
	
	private PokemonsDAO pokemonsDAO = new PokemonsDAOImpl();
	
	public Pokemons getPokemonWithPokemonPersona (String pokePersona) {
		return pokemonsDAO.getPokemonByPersona(pokePersona);		
	}
	
	public List<Pokemons> catchEmAll(){
		return pokemonsDAO.getAllPokemon();
	}
	

}
