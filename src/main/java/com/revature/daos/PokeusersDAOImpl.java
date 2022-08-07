package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.Pokeuser;
import com.revature.utils.ConnectionUtil;

public class PokeusersDAOImpl implements PokeusersDAO{

	@Override
	public Pokeuser getPokeuserById(int id) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM pokeusers WHERE trainer_id = "+id+";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {//Cursor based, .next will move to the next. Otherwise will start one before. 
				Pokeuser pokeuser = new Pokeuser(
						result.getInt("trainer_id"),
						null,
						result.getInt("pass_word"),
						result.getString("account_type"),
						result.getDouble("poke_dollars")
						);
				return pokeuser;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main (String[]args) {
		PokeusersDAO aDao = new PokeusersDAOImpl();
		
		Pokeuser a = aDao.getPokeuserById(6);
		System.out.println(a);
	}
	
	

}
