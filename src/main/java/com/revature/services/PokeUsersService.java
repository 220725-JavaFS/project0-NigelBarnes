package com.revature.services;

import com.revature.daos.PokeUsersDAO;
import com.revature.daos.PokeusersDAOImpl;
import com.revature.models.PokeUsers;

public class PokeUsersService {
	
	private PokeUsersDAO pokeusersDao = new PokeusersDAOImpl();
	
	
	public PokeUsers loginUsers (String username, int password) {
		return pokeusersDao.loginPokeUsers(username, password);
	}

	public PokeUsers seeSinglePokeDollarsByUsername (String username) {
		return pokeusersDao.viewPokedollarsByPokeUsername(username);
	}
	
	public PokeUsers changeTrainerPasswordByUsername (String username, int password) {
		return pokeusersDao.changePokeUsersPassword(username, password);
	}

}
