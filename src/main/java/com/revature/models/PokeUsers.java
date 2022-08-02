package com.revature.models;

import java.util.Objects;

public class PokeUsers {
	
	private String pokeUsername;
	private int pokeDollars;
	private String pokePassword;
	private boolean isReturningUser;
	
	
	public PokeUsers(String pokeUsername, int pokeDollars) {
		super();
		this.pokeUsername = pokeUsername;
		this.pokeDollars = pokeDollars;
	}
	
	public PokeUsers() {
		super();
	}

    //Grabbing Username from User
	public String getPokeUsername() {
		return pokeUsername;
	}
	//Setting Username, if name is blank, will return nothing
	public void setPokeUsername(String pokeUsername) {
		if (pokeUsername.equals("")) {
			return;
		}
		this.pokeUsername = pokeUsername;
	}
	public int getPokeDollars() {
		return pokeDollars;
	}
	public void setPokeDollars(int pokeDollars) {
		this.pokeDollars = pokeDollars;
	}
	public String getPokePassword() {
		return pokePassword;
	}
	public void setPokePassword(String pokePassword) {
		this.pokePassword = pokePassword;
	}

	public boolean isReturningUser() {
		return isReturningUser;
	}

	public void setReturningUser(boolean isReturningUser) {
		this.isReturningUser = isReturningUser;
	}

	// may not need this if we don't cover DataBases
	@Override
	public int hashCode() {
		return Objects.hash(isReturningUser, pokeDollars, pokePassword, pokeUsername);
	}

	// may not need this if we don't cover DataBases
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokeUsers other = (PokeUsers) obj;
		return isReturningUser == other.isReturningUser && pokeDollars == other.pokeDollars
				&& Objects.equals(pokePassword, other.pokePassword) && Objects.equals(pokeUsername, other.pokeUsername);
	}
	
	
	
	
	
	
	

}
