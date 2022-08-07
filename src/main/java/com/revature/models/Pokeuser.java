package com.revature.models;

public class Pokeuser {
	
	private int trainerId;
	private Username username;
	private int password;
	private String accountType;
	private double pokeDollars;
	
	public Pokeuser(int trainerId, Username username, int password, String accountType, double pokeDollars) {
		super();
		this.trainerId = trainerId;
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.pokeDollars = pokeDollars;
	}
	
	public Pokeuser(Username username, int password, String accountType, double pokeDollars) {
		super();
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.pokeDollars = pokeDollars;
	}

	public Pokeuser() {
		super();
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public Username getUsername() {
		return username;
	}

	public void setUsername(Username username) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + password;
		long temp;
		temp = Double.doubleToLongBits(pokeDollars);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Pokeuser other = (Pokeuser) obj;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (password != other.password)
			return false;
		if (Double.doubleToLongBits(pokeDollars) != Double.doubleToLongBits(other.pokeDollars))
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
		return "Pokeuser [trainerId=" + trainerId + ", username=" + username + ", password=" + password
				+ ", accountType=" + accountType + ", pokeDollars=" + pokeDollars + "]";
	}
	
	
	

}
