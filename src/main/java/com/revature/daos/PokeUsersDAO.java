package com.revature.daos;

import java.util.List;

import com.revature.models.PokeUsers;

public interface PokeUsersDAO {
	
	public PokeUsers getPokeuserByUsername(String username);
	
	List<PokeUsers> getAllPokeUsers();
	
	public PokeUsers loginPokeUsers(String username, String password);
	
	public PokeUsers depositPokedollars(int pokeDollars);

	public PokeUsers viewPokedollarsByUsername(String username);
}
