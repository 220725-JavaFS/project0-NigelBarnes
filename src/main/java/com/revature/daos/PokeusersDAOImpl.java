package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.PokeUsers;
import com.revature.models.TrainerId;
import com.revature.utils.ConnectionUtil;

public class PokeusersDAOImpl implements PokeUsersDAO{

	@Override
	public PokeUsers getPokeuserByUsername(String username) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq2 = "SELECT * FROM pokeusers WHERE user_name = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sq2);
			
			statement.setString(1, username); //Checking for SQL injection
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {//Cursor based, .next will move to the next. Otherwise will start one before. 
				PokeUsers pokeUsers = new PokeUsers(
						null,
						result.getString("user_name"),
						result.getInt("pass_word"),
						result.getString("account_type"),
						result.getDouble("poke_dollars")
												);
				
				int trainerId = result.getInt("trainer_id");
				if(trainerId!=0) {
					TrainerIdDAO TrainerIdDAO = new TrainerIdDAOImpl();
					//TrainerId trainerId = 
				}
				
				return pokeUsers;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public PokeUsers loginPokeUsers(String username, String password) {
	 try (Connection conn = ConnectionUtil.getConnection()){
		 
		 String sq1 = "SELECT user_name, pass_word ";
		 
	 }catch(SQLException e) {
		 
		 e.printStackTrace();
	 }
	 
		return null;
	}
	
	
	public static void main (String[]args) {
		PokeUsersDAO aDao = new PokeusersDAOImpl();
		
		PokeUsers a = aDao.getPokeuserByUsername("Nekros");
		System.out.println(a);
	}

	@Override
	public PokeUsers depositPokedollars(int pokeDollars) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PokeUsers viewPokedollarsByUsername(String username) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq1 = "SELECT poke_dollars FROM pokeusers WHERE user_name = ?;";
			
         PreparedStatement statement = conn.prepareStatement(sq1);
			
			statement.setString(1, username); //Checking for SQL injection
			
			ResultSet result = statement.executeQuery();
			
			if (result.next()) {
				PokeUsers pokeUsers = new PokeUsers();
			}
			//PLEASE FINISH THIS TOMORROW
				
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<PokeUsers> getAllPokeUsers() {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq2 = "SELECT * FROM pokeusers LEFT JOIN trainerpersona ON trainerpersona.trainer_id = pokeusers.trainer_id;";
			
			PreparedStatement statement = conn.prepareStatement(sq2);
			
			ResultSet result = statement.executeQuery();
			
			List<PokeUsers> pokeuserList = new ArrayList<>();
			
			while(result.next()) {//Cursor based, .next will move to the next. Otherwise will start one before. 
				PokeUsers pokeUsers = new PokeUsers(
						null,
						result.getString("user_name"),
						result.getInt("pass_word"),
						result.getString("account_type"),
						result.getDouble("poke_dollars")
												);
				
				int trainerId = result.getInt("trainer_id");
				if(trainerId!=0) {
					
					TrainerId trainerId = new TrainerId();
					//Finish working HERE please
				}
				
				pokeuserList.add(pokeUsers);
			
			}
			return pokeuserList;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	
	
	

}
