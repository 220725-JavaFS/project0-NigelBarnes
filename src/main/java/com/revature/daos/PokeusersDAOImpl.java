package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.PokeUsers;
import com.revature.utils.ConnectionUtil;

public class PokeusersDAOImpl implements PokeUsersDAO{

	@Override
	public PokeUsers getPokeUserbyUsername(String username) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq2 = "SELECT * FROM pokeusers WHERE user_name = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sq2);
			
			statement.setString(1, username); //Checking for SQL injection
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {//Cursor based, .next will move to the next. Otherwise will start one before. 
				  PokeUsers pokeUsers = new PokeUsers(
						  result.getInt("trainer_id"),
						  result.getString("user_name"),
						  result.getInt("pass_word"),
						  result.getString("account_type"),
						  result.getDouble("poke_dollars"),
						  null
						  );
				  		System.out.println(pokeUsers);
				       return pokeUsers;
				       
			}
			
				}catch(SQLException e) {
		e.printStackTrace();
	}
		return null;
	}
	@Override
	public PokeUsers viewPokedollarsByPokeUsername(String username) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq1 = "SELECT * FROM pokeusers WHERE user_name = ?;";
			PreparedStatement statement1 = conn.prepareStatement(sq1);
			statement1.setString(1, username);
			ResultSet result = statement1.executeQuery();
			
			if (result.next()) {
				PokeUsers pokeUsers = new PokeUsers(
						result.getInt("trainer_id"),
						result.getString("user_name"),
						result.getInt("pass_word"),
						result.getString("account_type"),
						result.getDouble("poke_dollars"),
						null
						);
			 System.out.println(pokeUsers.getPokeDollars());	
			 
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
	
	}
	
	
	@Override
	public PokeUsers loginPokeUsers(String username, int password) {
	 try (Connection conn = ConnectionUtil.getConnection()){
		 
		 String sq1 = "SELECT * FROM pokeusers WHERE user_name = ?;";
		 
		 PreparedStatement statement1 = conn.prepareStatement(sq1);
		
		 statement1.setString(1, username);
		 
		 ResultSet result = statement1.executeQuery();
		 
		 if (result.next()) {
			 PokeUsers pokeUsers = new PokeUsers(
					 result.getInt("trainer_id"),
					 result.getString("user_name"),
					 result.getInt("pass_word"),
					 result.getString("account_type"),
					 result.getDouble("poke_dollars"),
					 null		 
					 );
		
			 	if (password==pokeUsers.getPassword()) { //This does not check if the Username Works. ONLY PASSWORD (requires better Validation).
			 		return pokeUsers;
			 	} else {
			 		return null;
			 	}
			 
		 	}
		 
	 	}catch(SQLException e) {
		 
		 e.printStackTrace();
	 }
	 
		return null;
	}
	
	
	

	//@Override
	public PokeUsers depositPokedollarsByTrainerId(double pokeDollars, int trainerId) {
		try (Connection conn = ConnectionUtil.getConnection()){
			String sq1 = "SELECT poke_dollars FROM pokeusers WHERE trainer_id = "+trainerId+";";
			
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(sq1);
			
			if (result.next()) {
				PokeUsers pokeUsers = new PokeUsers(
						result.getDouble("poke_dollars")
						);	
				if (pokeUsers!=null) {
					return pokeUsers;
								}
			
			 }
				
			
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
						result.getInt("trainer_id"),
						result.getString("user_name"),
						result.getInt("pass_word"),
						result.getString("account_type"),
						result.getDouble("poke_dollars"),
						null);
		
				
				int trainerId = result.getInt("trainer_id");
				if(trainerId!=0) {
					
					//TrainerId trainerId = new TrainerId();
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



	@Override
	public PokeUsers changePokeUsersPassword(String username, int password) {
		try (Connection conn = ConnectionUtil.getConnection()){
			 
			 String sq1 = "UPDATE pokeusers SET pass_word = "+password+" WHERE user_name = ?;";
			 
			 PreparedStatement statement1 = conn.prepareStatement(sq1);
			
			 statement1.setString(1, username);
			 statement1.execute();
			 
		 	}catch(SQLException e) {
			 
			 e.printStackTrace();
		 }
		 
			return null;
		}


	@Override
	public PokeUsers changePokeDollarsByUsername(String username, double pokeDollars) {
		try (Connection conn = ConnectionUtil.getConnection()){
			 
			 String sq1 = "UPDATE pokeusers SET poke_dollars = "+pokeDollars+" WHERE user_name = ?;";
			 
			 PreparedStatement statement1 = conn.prepareStatement(sq1);
			
			 statement1.setString(1, username);
			 statement1.execute();
			 
		 	}catch(SQLException e) {
			 
			 e.printStackTrace();
		 }
		 
			return null;
		}


	@Override
	public PokeUsers depositPokeDollarsByUsername(String username, double deposit) {
		try (Connection conn = ConnectionUtil.getConnection()){
			
			 String sq1 = "SELECT * FROM pokeusers WHERE user_name = ?;";
			 
			 PreparedStatement statement1 = conn.prepareStatement(sq1);
			
			 statement1.setString(1, username);
			 
			 ResultSet result = statement1.executeQuery();
			
			if(result.next()) {//Cursor based, .next will move to the next. Otherwise will start one before. 
		  		PokeUsers pokeUser = new PokeUsers(
		  				result.getInt("trainer_id"),
						result.getString("user_name"),
						result.getInt("pass_word"),
						result.getString("account_type"),
						result.getDouble("poke_dollars"),
						null);
		  		Double newValue = pokeUser.getPokeDollars() + deposit;
		  		
		  		String sq2 = "UPDATE pokeusers SET poke_dollars = " +newValue+ " WHERE user_name = '"+username+"';";
		  		
		  		PreparedStatement statement2 = conn.prepareStatement(sq2);
		  		statement2.execute();
		  		
			}
			
			
		  }catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}


	@Override
	public String getTrainerTypeByUsername(String username) {
		try (Connection conn = ConnectionUtil.getConnection()){
			 
			 String sq1 = "SELECT account_type FROM pokeusers WHERE user_name = ?;";
			 
			 PreparedStatement statement1 = conn.prepareStatement(sq1);
			
			 statement1.setString(1, username);
			 
			 ResultSet result = statement1.executeQuery();
			 
			 if (result.next()) {
				 return result.getString("account_type");
			 } 
			 
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public static void main (String[]args) {
		PokeusersDAOImpl poke1 = new PokeusersDAOImpl();
		poke1.depositPokeDollarsByUsername("Nekros", 503);
	}

	

}
