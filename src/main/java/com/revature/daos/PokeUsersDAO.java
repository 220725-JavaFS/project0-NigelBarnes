package com.revature.daos;

import java.util.List;

import com.revature.models.PokeUsers;

public interface PokeUsersDAO {
	
	//public PokeUsers getPokeuserByUsername(String username);
	
	List<PokeUsers> getAllPokeUsers();
	
	public PokeUsers loginPokeUsers(String username, int password);
	
	public PokeUsers depositPokedollarsByTrainerId(double pokeDollars, int TrainerId);

	public PokeUsers viewPokedollarsByPokeUsername(String username);
	
//	public PokeUsers getPokeUsersAccountType(String username);
	
	public PokeUsers changePokeUsersPassword(String username, int password);
	
	public PokeUsers changePokeDollarsByUsername(String username, double pokeDollars);
}   
