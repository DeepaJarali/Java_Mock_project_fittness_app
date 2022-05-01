package com.sapient.hybris.service;

import java.util.List;

import com.sapient.hybris.model.Trainer;

public interface TrainerService {
	public abstract Trainer getTrainerById(Integer trainer_id) throws TrainerException;
	public abstract List<Trainer> getTrainer() throws TrainerException;
	public abstract String addTrainer(Trainer trainer) throws TrainerException;
	public abstract String deleteTrainer(Integer trainer_id) throws TrainerException;
	public abstract String updateTrainer(Trainer trainer) throws TrainerException;
}
