package com.revature.models;

public class PokeUsers {
	
	private TrainerId trainerId;
	private String username;
	private int password;
	private String accountType;
	private double pokeDollars;
	
	
	public PokeUsers(TrainerId trainerId, String username, int password, String accountType, double pokeDollars) {
		super();
		this.trainerId = trainerId;
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.pokeDollars = pokeDollars;
	}


	public PokeUsers() {
		super();
	}


	public PokeUsers(String username, int password, String accountType, double pokeDollars) {
		super();
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.pokeDollars = pokeDollars;
	}
	
	public PokeUsers(String username) {
		super();
		this.username = username;
	}


	public TrainerId getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(TrainerId trainerId) {
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + password;
		long temp;
		temp = Double.doubleToLongBits(pokeDollars);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((trainerId == null) ? 0 : trainerId.hashCode());
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
		if (trainerId == null) {
			if (other.trainerId != null)
				return false;
		} else if (!trainerId.equals(other.trainerId))
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
				+ ", accountType=" + accountType + ", pokeDollars=" + pokeDollars + "]";
	}
	
	
	
	
	
	
	
	
	

}
