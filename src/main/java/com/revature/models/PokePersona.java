package com.revature.models;

public class PokePersona {
	
	private int trainerId;
	private String pokePersona;
	private String Region;
	private String elementType;
	private Pokemons pokemons;
	
	public PokePersona(int trainerId, String pokePersona, String region, String elementType, Pokemons pokemons) {
		super();
		this.trainerId = trainerId;
		this.pokePersona = pokePersona;
		Region = region;
		this.elementType = elementType;
		this.pokemons = pokemons;
	}

	public PokePersona() {
		super();
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getPokePersona() {
		return pokePersona;
	}

	public void setPokePersona(String pokePersona) {
		this.pokePersona = pokePersona;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getElementType() {
		return elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public Pokemons getPokemons() {
		return pokemons;
	}

	public void setPokemons(Pokemons pokemons) {
		this.pokemons = pokemons;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Region == null) ? 0 : Region.hashCode());
		result = prime * result + ((elementType == null) ? 0 : elementType.hashCode());
		result = prime * result + ((pokePersona == null) ? 0 : pokePersona.hashCode());
		result = prime * result + ((pokemons == null) ? 0 : pokemons.hashCode());
		result = prime * result + trainerId;
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
		PokePersona other = (PokePersona) obj;
		if (Region == null) {
			if (other.Region != null)
				return false;
		} else if (!Region.equals(other.Region))
			return false;
		if (elementType == null) {
			if (other.elementType != null)
				return false;
		} else if (!elementType.equals(other.elementType))
			return false;
		if (pokePersona == null) {
			if (other.pokePersona != null)
				return false;
		} else if (!pokePersona.equals(other.pokePersona))
			return false;
		if (pokemons == null) {
			if (other.pokemons != null)
				return false;
		} else if (!pokemons.equals(other.pokemons))
			return false;
		if (trainerId != other.trainerId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PokePersona [trainerId=" + trainerId + ", pokePersona=" + pokePersona + ", Region=" + Region
				+ ", elementType=" + elementType + ", pokemons=" + pokemons + "]";
	}
	
	
	
	

}
