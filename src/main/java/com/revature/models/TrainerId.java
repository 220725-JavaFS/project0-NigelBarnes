package com.revature.models;

public class TrainerId {
	
	private int trainerId;
	private TrainerPersona trainerPersona;
	private String region;
	private String elementType;
	
	
	public TrainerId(int trainerId, TrainerPersona trainerPersona, String region, String elementType) {
		super();
		this.trainerId = trainerId;
		this.trainerPersona = trainerPersona;
		this.region = region;
		this.elementType = elementType;
	}


	public TrainerId(TrainerPersona trainerPersona, String region, String elementType) {
		super();
		this.trainerPersona = trainerPersona;
		this.region = region;
		this.elementType = elementType;
	}
	
	

	public TrainerId(int trainerId, String region, String elementType) {
		super();
		this.trainerId = trainerId;
		this.region = region;
		this.elementType = elementType;
	}


	public TrainerId() {
		super();
	}


	public int getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
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
		TrainerId other = (TrainerId) obj;
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
		return "Trainerid [trainerId=" + trainerId + ", trainerPersona=" + trainerPersona + ", region=" + region
				+ ", elementType=" + elementType + "]";
	}
	
	
	
	
	

}
