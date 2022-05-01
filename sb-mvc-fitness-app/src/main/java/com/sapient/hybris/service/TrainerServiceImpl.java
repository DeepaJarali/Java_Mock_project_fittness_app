package com.sapient.hybris.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.hybris.dao.TrainerDAO;
import com.sapient.hybris.model.Trainer;

@Service
@Transactional
public class TrainerServiceImpl implements TrainerService {
	
	@Autowired
      private TrainerDAO trainerDAO;
	
	@Override
	public Trainer getTrainerById(Integer trainer_id) throws TrainerException {
		try {
			Trainer trainer= trainerDAO.getTrainerById(trainer_id);
			
			return trainer; 
		}catch(SQLException e) {
			
			throw new TrainerException(e.getMessage(),e);
		}catch(Exception e) {
			
			throw new TrainerException(e.getMessage(),e);
		}
	
	}

	@Override
	public List<Trainer> getTrainer() throws TrainerException {
		try {
			List<Trainer> TrainerList= trainerDAO.getTrainer();			
			return TrainerList; 
		}catch(SQLException e) {
			
			throw new TrainerException(e.getMessage(),e);
		}catch(Exception e) {
			
			throw new TrainerException(e.getMessage(),e);
		}
	}

	@Override
	public String addTrainer(Trainer trainer) throws TrainerException {
		try {			
			return trainerDAO.addTrainer(trainer); 
		}catch(SQLException e) {
			
			throw new TrainerException(e.getMessage(),e);
		}catch(Exception e) {
			
			throw new TrainerException(e.getMessage(),e);
		}
	}

	@Override
	public String deleteTrainer(Integer trainer_id) throws TrainerException {
		try {			
			return trainerDAO.deleteTrainer(trainer_id);
		}catch(SQLException e) {
			
			throw new TrainerException(e.getMessage(),e);
		}catch(Exception e) {
			
			throw new TrainerException(e.getMessage(),e);
		}
	}

	@Override
	public String updateTrainer(Trainer trainer) throws TrainerException {
		try {			
			return trainerDAO.updateTrainer(trainer);
		}catch(SQLException e) {
			
			throw new TrainerException(e.getMessage(),e);
		}catch(Exception e) {
			
			throw new TrainerException(e.getMessage(),e);
		}
	}

}
