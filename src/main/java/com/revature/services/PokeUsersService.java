package com.revature.services;

import com.revature.daos.PokeUsersDAO;
import com.revature.daos.PokeusersDAOImpl;
import com.revature.models.PokeUsers;

public class PokeUsersService {
	
	private PokeUsersDAO pokeusersDao = new PokeusersDAOImpl();
	
	public PokeUsers getSinglePokeuser (String username) {
		return pokeusersDao.getPokeuserByUsername(username);
	}
	

}
