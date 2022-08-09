package com.revature.models;

public class Pokemons {
	
	private String pokePersona;
	private String poke1;
	private String poke2;
	private String poke3;
	private String poke4;
	private String poke5;
	private String poke6;
	
	public Pokemons(String pokePersona, String poke1, String poke2, String poke3, String poke4, String poke5,
			String poke6) {
		super();
		this.pokePersona = pokePersona;
		this.poke1 = poke1;
		this.poke2 = poke2;
		this.poke3 = poke3;
		this.poke4 = poke4;
		this.poke5 = poke5;
		this.poke6 = poke6;
	}

	public Pokemons() {
		super();
	}

	public String getPokePersona() {
		return pokePersona;
	}

	public void setPokePersona(String pokePersona) {
		this.pokePersona = pokePersona;
	}

	public String getPoke1() {
		return poke1;
	}

	public void setPoke1(String poke1) {
		this.poke1 = poke1;
	}

	public String getPoke2() {
		return poke2;
	}

	public void setPoke2(String poke2) {
		this.poke2 = poke2;
	}

	public String getPoke3() {
		return poke3;
	}

	public void setPoke3(String poke3) {
		this.poke3 = poke3;
	}

	public String getPoke4() {
		return poke4;
	}

	public void setPoke4(String poke4) {
		this.poke4 = poke4;
	}

	public String getPoke5() {
		return poke5;
	}

	public void setPoke5(String poke5) {
		this.poke5 = poke5;
	}

	public String getPoke6() {
		return poke6;
	}

	public void setPoke6(String poke6) {
		this.poke6 = poke6;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poke1 == null) ? 0 : poke1.hashCode());
		result = prime * result + ((poke2 == null) ? 0 : poke2.hashCode());
		result = prime * result + ((poke3 == null) ? 0 : poke3.hashCode());
		result = prime * result + ((poke4 == null) ? 0 : poke4.hashCode());
		result = prime * result + ((poke5 == null) ? 0 : poke5.hashCode());
		result = prime * result + ((poke6 == null) ? 0 : poke6.hashCode());
		result = prime * result + ((pokePersona == null) ? 0 : pokePersona.hashCode());
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
		Pokemons other = (Pokemons) obj;
		if (poke1 == null) {
			if (other.poke1 != null)
				return false;
		} else if (!poke1.equals(other.poke1))
			return false;
		if (poke2 == null) {
			if (other.poke2 != null)
				return false;
		} else if (!poke2.equals(other.poke2))
			return false;
		if (poke3 == null) {
			if (other.poke3 != null)
				return false;
		} else if (!poke3.equals(other.poke3))
			return false;
		if (poke4 == null) {
			if (other.poke4 != null)
				return false;
		} else if (!poke4.equals(other.poke4))
			return false;
		if (poke5 == null) {
			if (other.poke5 != null)
				return false;
		} else if (!poke5.equals(other.poke5))
			return false;
		if (poke6 == null) {
			if (other.poke6 != null)
				return false;
		} else if (!poke6.equals(other.poke6))
			return false;
		if (pokePersona == null) {
			if (other.pokePersona != null)
				return false;
		} else if (!pokePersona.equals(other.pokePersona))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pokemons [pokePersona=" + pokePersona + ", poke1=" + poke1 + ", poke2=" + poke2 + ", poke3=" + poke3
				+ ", poke4=" + poke4 + ", poke5=" + poke5 + ", poke6=" + poke6 + "]";
	}
	
	
	
	
	
	
	

}
