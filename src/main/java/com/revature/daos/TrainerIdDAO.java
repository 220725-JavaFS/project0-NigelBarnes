package com.revature.daos;

import com.revature.models.TrainerId;

public interface TrainerIdDAO {
	
	TrainerId getTrainerIdByUsername(String username);

}
