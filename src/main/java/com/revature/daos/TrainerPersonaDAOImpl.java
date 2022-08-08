package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.TrainerPersona;
import com.revature.utils.ConnectionUtil;

public class TrainerPersonaDAOImpl implements TrainerPersonaDAO{


	@Override
	public TrainerPersona getTrainerPersonaByPokedexId(int pokedexId) {
		try (Connection conn = ConnectionUtil.getConnection()){
		String sql = "SELECT * FROM trainerpoke WHERE pokedex_id = '"+pokedexId+"';";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		if(result.next()) {//Cursor based, .next will move to the next. Otherwise will start one before. 
			TrainerPersona trainerPersona = new TrainerPersona( 
					result.getInt("trainer_id"),
					result.getString("trainer_persona"),
					result.getInt("pokedex_id"),
					result.getString("poke_1"),
					result.getString("poke_2"),
					result.getString("poke_3"),
					result.getString("poke_4"),
					result.getString("poke_5"),
					result.getString("poke_6"));
			
			return trainerPersona;
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
		
		return null;
	}
	
	public static void main (String[]args) {
		TrainerPersonaDAO aDao = new TrainerPersonaDAOImpl();
		
		TrainerPersona a = aDao.getTrainerPersonaByPokedexId(2);
		System.out.println(a);
		
	}
	//NEED TO IMPLEMENT THESE METHODS

	@Override
	public TrainerPersona getPokemonList(int pokedexId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainerPersona changePokemon(int pokedexId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainerPersona releasePokemon(int pokedexId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainerPersona catchPokemon(int pokedexId) {
		// TODO Auto-generated method stub
		return null;
	}

}
