package com.sapient.hybris.dao;

import java.util.List;

import com.sapient.hybris.model.Trainer;
public interface TrainerDAO {
	public abstract Trainer getTrainerById(Integer trainer_id) throws Exception;
	public abstract List<Trainer> getTrainer() throws Exception;
	public abstract String addTrainer(Trainer trainer) throws Exception;
	public abstract String deleteTrainer(Integer trainer_id) throws Exception;
	public abstract String updateTrainer(Trainer trainer) throws Exception;
}
