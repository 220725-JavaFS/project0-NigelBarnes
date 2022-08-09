package com.revature.models;

public class PokeUsers {
	
	private int trainerId;
	private String username;
	private int password;
	private String accountType;
	private double pokeDollars;
	private PokePersona pokePersona;
	
	
	public PokeUsers(int trainerId, String username, int password, String accountType, double pokeDollars,
			PokePersona pokePersona) {
		super();
		this.trainerId = trainerId;
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.pokeDollars = pokeDollars;
		this.pokePersona = pokePersona;
	}
	
	
	public PokeUsers(double pokeDollars) {
		super();
		this.pokeDollars = pokeDollars;
	}
	
	


	public PokeUsers() {
		super();
	}


	public int getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public double getPokeDollars() {
		return pokeDollars;
	}


	public void setPokeDollars(double pokeDollars) {
		this.pokeDollars = pokeDollars;
	}


	public PokePersona getPokePersona() {
		return pokePersona;
	}


	public void setPokePersona(PokePersona pokePersona) {
		this.pokePersona = pokePersona;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + password;
		long temp;
		temp = Double.doubleToLongBits(pokeDollars);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((pokePersona == null) ? 0 : pokePersona.hashCode());
		result = prime * result + trainerId;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokeUsers other = (PokeUsers) obj;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (password != other.password)
			return false;
		if (Double.doubleToLongBits(pokeDollars) != Double.doubleToLongBits(other.pokeDollars))
			return false;
		if (pokePersona == null) {
			if (other.pokePersona != null)
				return false;
		} else if (!pokePersona.equals(other.pokePersona))
			return false;
		if (trainerId != other.trainerId)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "PokeUsers [trainerId=" + trainerId + ", username=" + username + ", password=" + password
				+ ", accountType=" + accountType + ", pokeDollars=" + pokeDollars + ", pokePersona=" + pokePersona
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
