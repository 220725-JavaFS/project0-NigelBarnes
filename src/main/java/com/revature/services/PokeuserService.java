package com.revature.services;

import com.revature.daos.PokeusersDAO;
import com.revature.daos.PokeusersDAOImpl;
import com.revature.models.Pokeuser;

public class PokeuserService {
	
	private PokeusersDAO pokeusersDao = new PokeusersDAOImpl();
	
	public Pokeuser getSinglePokeuser (int id) {
		return pokeusersDao.getPokeuserById(id);
	}

}
