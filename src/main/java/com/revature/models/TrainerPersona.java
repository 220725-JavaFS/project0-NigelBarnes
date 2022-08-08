package com.revature.models;

public class TrainerPersona {
	
	private int trainerId;
	private String trainerPersona;
	private int pokedexId;
	private String pokemon1;
	private String pokemon2;
	private String pokemon3;
	private String pokemon4;
	private String pokemon5;
	private String pokemon6;
	
	
	public TrainerPersona(int trainerId, String trainerPersona, int pokedexId, String pokemon1, String pokemon2,
			String pokemon3, String pokemon4, String pokemon5, String pokemon6) {
		super();
		this.trainerId = trainerId;
		this.trainerPersona = trainerPersona;
		this.pokedexId = pokedexId;
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		this.pokemon3 = pokemon3;
		this.pokemon4 = pokemon4;
		this.pokemon5 = pokemon5;
		this.pokemon6 = pokemon6;
	}


	public TrainerPersona() {
		super();
	}


	public int getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}


	public String getTrainerPersona() {
		return trainerPersona;
	}


	public void setTrainerPersona(String trainerPersona) {
		this.trainerPersona = trainerPersona;
	}


	public int getPokedexId() {
		return pokedexId;
	}


	public void setPokedexId(int pokedexId) {
		this.pokedexId = pokedexId;
	}


	public String getPokemon1() {
		return pokemon1;
	}


	public void setPokemon1(String pokemon1) {
		this.pokemon1 = pokemon1;
	}


	public String getPokemon2() {
		return pokemon2;
	}


	public void setPokemon2(String pokemon2) {
		this.pokemon2 = pokemon2;
	}


	public String getPokemon3() {
		return pokemon3;
	}


	public void setPokemon3(String pokemon3) {
		this.pokemon3 = pokemon3;
	}


	public String getPokemon4() {
		return pokemon4;
	}


	public void setPokemon4(String pokemon4) {
		this.pokemon4 = pokemon4;
	}


	public String getPokemon5() {
		return pokemon5;
	}


	public void setPokemon5(String pokemon5) {
		this.pokemon5 = pokemon5;
	}


	public String getPokemon6() {
		return pokemon6;
	}


	public void setPokemon6(String pokemon6) {
		this.pokemon6 = pokemon6;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pokedexId;
		result = prime * result + ((pokemon1 == null) ? 0 : pokemon1.hashCode());
		result = prime * result + ((pokemon2 == null) ? 0 : pokemon2.hashCode());
		result = prime * result + ((pokemon3 == null) ? 0 : pokemon3.hashCode());
		result = prime * result + ((pokemon4 == null) ? 0 : pokemon4.hashCode());
		result = prime * result + ((pokemon5 == null) ? 0 : pokemon5.hashCode());
		result = prime * result + ((pokemon6 == null) ? 0 : pokemon6.hashCode());
		result = prime * result + trainerId;
		result = prime * result + ((trainerPersona == null) ? 0 : trainerPersona.hashCode());
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
		TrainerPersona other = (TrainerPersona) obj;
		if (pokedexId != other.pokedexId)
			return false;
		if (pokemon1 == null) {
			if (other.pokemon1 != null)
				return false;
		} else if (!pokemon1.equals(other.pokemon1))
			return false;
		if (pokemon2 == null) {
			if (other.pokemon2 != null)
				return false;
		} else if (!pokemon2.equals(other.pokemon2))
			return false;
		if (pokemon3 == null) {
			if (other.pokemon3 != null)
				return false;
		} else if (!pokemon3.equals(other.pokemon3))
			return false;
		if (pokemon4 == null) {
			if (other.pokemon4 != null)
				return false;
		} else if (!pokemon4.equals(other.pokemon4))
			return false;
		if (pokemon5 == null) {
			if (other.pokemon5 != null)
				return false;
		} else if (!pokemon5.equals(other.pokemon5))
			return false;
		if (pokemon6 == null) {
			if (other.pokemon6 != null)
				return false;
		} else if (!pokemon6.equals(other.pokemon6))
			return false;
		if (trainerId != other.trainerId)
			return false;
		if (trainerPersona == null) {
			if (other.trainerPersona != null)
				return false;
		} else if (!trainerPersona.equals(other.trainerPersona))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TrainerPersona [trainerId=" + trainerId + ", trainerPersona=" + trainerPersona + ", pokedexId="
				+ pokedexId + ", pokemon1=" + pokemon1 + ", pokemon2=" + pokemon2 + ", pokemon3=" + pokemon3
				+ ", pokemon4=" + pokemon4 + ", pokemon5=" + pokemon5 + ", pokemon6=" + pokemon6 + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}