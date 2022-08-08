package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.PokeUsers;
import com.revature.models.TrainerId;
import com.revature.utils.ConnectionUtil;

public class TrainerIdDAOImpl implements TrainerIdDAO {

	@Override
	public TrainerId getTrainerIdByUsername(String username) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq1 = "SELECT trainer_id FROM pokeusers WHERE user_name = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sq1);
			
			statement.setString(1, username); //Checking for SQL injection
			
			ResultSet result = statement.executeQuery();
	
			if(result.next()) {//Cursor based, .next will move to the next. Otherwise will start one before. 
				TrainerId trainerId = new TrainerId(
						result.getInt("trainer_id"),
						null,
						result.getString("account_type"),
						result.getString("poke_dollars")
												); //THIS IS WRONG I HAVE THE WRONG COLUMN NAMES FOR THE TABLE "TRAINER PERSONA"
				
				return trainerId;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main (String[]args) {
		TrainerIdDAO aDao = new TrainerIdDAOImpl();
		
		TrainerId a = aDao.getTrainerIdByUsername("Nekros");
		System.out.println(a);
	}
	

}
