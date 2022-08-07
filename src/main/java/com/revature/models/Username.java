package com.revature.models;

public class Username {
	
	private String usersname;
	private TrainerPersona trainerPersona;
	private String region;
	private String elementType;
	
	
	public Username(String usersname, TrainerPersona trainerPersona, String region, String elementType) {
		super();
		this.usersname = usersname;
		this.trainerPersona = trainerPersona;
		this.region = region;
		this.elementType = elementType;
	}


	public Username() {
		super();
	}


	public String getUsersname() {
		return usersname;
	}


	public void setUsersname(String usersname) {
		this.usersname = usersname;
	}


	public TrainerPersona getTrainerPersona() {
		return trainerPersona;
	}


	public void setTrainerPersona(TrainerPersona trainerPersona) {
		this.trainerPersona = trainerPersona;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getElementType() {
		return elementType;
	}


	public void setElementType(String elementType) {
		this.elementType = elementType;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elementType == null) ? 0 : elementType.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((trainerPersona == null) ? 0 : trainerPersona.hashCode());
		result = prime * result + ((usersname == null) ? 0 : usersname.hashCode());
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
		Username other = (Username) obj;
		if (elementType == null) {
			if (other.elementType != null)
				return false;
		} else if (!elementType.equals(other.elementType))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (trainerPersona == null) {
			if (other.trainerPersona != null)
				return false;
		} else if (!trainerPersona.equals(other.trainerPersona))
			return false;
		if (usersname == null) {
			if (other.usersname != null)
				return false;
		} else if (!usersname.equals(other.usersname))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Username [usersname=" + usersname + ", trainerPersona=" + trainerPersona + ", region=" + region
				+ ", elementType=" + elementType + "]";
	}
	
	
	
	

}
