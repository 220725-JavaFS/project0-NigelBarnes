package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.revature.models.Pokemons;
import com.revature.utils.ConnectionUtil;

public class PokemonsDAOImpl implements PokemonsDAO{

	@Override
	public Pokemons getPokemonByPersona(String pokePersona) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq1 = "SELECT * FROM pokemons WHERE user_name = ?;";
			PreparedStatement statement1 = conn.prepareStatement(sq1);
			statement1.setString(1, pokePersona);
			ResultSet result = statement1.executeQuery();
			
			if (result.next()) {
				Pokemons pokemons = new Pokemons(
						result.getString("trainer_persona"),
						result.getString("poke_1"),
						result.getString("poke_2"),
						result.getString("poke_3"),
						result.getString("poke_4"),
						result.getString("poke_5"),
						result.getString("poke_6")
						);
				
				return pokemons;
					 
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
			
	}

	@Override
	public List<Pokemons> getAllPokemon() {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq1 = "SELECT * FROM pokemons;";
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(sq1);
			
			List<Pokemons> pokemonsList = new LinkedList<Pokemons>();
			
			while(result.next()) {
				Pokemons pokemons = new Pokemons(
						result.getString("trainer_persona"),
						result.getString("poke_1"),
						result.getString("poke_2"),
						result.getString("poke_3"),
						result.getString("poke_4"),
						result.getString("poke_5"),
						result.getString("poke_6")
						);
				
				pokemonsList.add(pokemons);
					 
				}
			return pokemonsList;
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
			
	}
	
	

}
