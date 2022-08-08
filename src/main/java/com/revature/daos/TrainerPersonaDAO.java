package com.revature.daos;

import com.revature.models.TrainerPersona;

public interface TrainerPersonaDAO {
	

    TrainerPersona getTrainerPersonaByPokedexId(int pokedexId);
    
    TrainerPersona getPokemonList(int pokedexId);
    
    TrainerPersona changePokemon(int pokedexId);
    
    TrainerPersona releasePokemon (int pokedexId);
    
    TrainerPersona catchPokemon (int pokedexId);

}
