package com.sapient.hybris.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import com.sapient.hybris.model.Trainer;
@Repository
public class TrainerDaoImpl implements TrainerDAO {

	@Autowired
	private DataSource dataSource;

	@Override
	public Trainer getTrainerById(Integer trainer_id) throws Exception {
		String sql= "select * from trainer_details where trainer_id= ?";
		try{	
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			PreparedStatement preparedStatement= connection.prepareStatement(sql);	
			preparedStatement.setInt(1, trainer_id);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				
				Trainer trainer= new Trainer();
				populateTrainer(resultSet, trainer);
				return trainer;
			}else {
				throw new SQLException("Invalid trainer_id");
			}

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
	}
	}

		
		private void populateTrainer(ResultSet resultSet, Trainer trainer) throws SQLException {
			trainer.setTrainer_id(resultSet.getInt("trainer_id"));
			trainer.setTrainer_name(resultSet.getString("trainer_name"));
			trainer.setTrainer_gender(resultSet.getString("trainer_gender"));
			trainer.setTrainer_age(resultSet.getInt("trainer_age"));
			//java.sql.Date -> java.time.LocalDate
			trainer.setDateofjoin(resultSet.getDate("dateofjoin").toLocalDate());
			trainer.setTrainer_contact(resultSet.getInt("trainer_contact"));
			trainer.setTrainer_experience(resultSet.getString("trainer_experience"));
			trainer.setTrainer_email(resultSet.getString("trainer_email"));
		}

	
		
	@Override
	public List<Trainer> getTrainer() throws Exception {
		String sql= "select * from Product";
		try{
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			Statement statement= connection.createStatement();
			ResultSet resultSet= statement.executeQuery(sql);
			List<Trainer> trainerList= new ArrayList<>();
			while(resultSet.next()) {
				Trainer trainer= new Trainer();
				populateTrainer(resultSet, trainer);
				trainerList.add(trainer);
			}

			if(trainerList.isEmpty()) {
				throw new SQLException("Table is empty");
			}
			return trainerList;

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}

	}
	@Override
	public String addTrainer(Trainer trainer) throws Exception {
		String sql= "insert into trainer_details values(?,?,?,?,?,?,?)";
		try{
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			PreparedStatement preparedStatement= connection.prepareStatement(sql);	
			//replace place holders with corresponding fields of employee object
			preparedStatement.setInt(1, trainer.getTrainer_id());
			preparedStatement.setString(2, trainer.getTrainer_name());
			preparedStatement.setString(3, trainer.getTrainer_gender());
			preparedStatement.setInt(4, trainer.getTrainer_age());
			//java.time.LocalDate to java.sql.Date
			preparedStatement.setDate(5, java.sql.Date.valueOf(trainer.getDateofjoin()));
			preparedStatement.setInt(6, trainer.getTrainer_contact());
			preparedStatement.setString(7, trainer.getTrainer_experience());
			preparedStatement.setString(8, trainer.getTrainer_email());
			//execute the DML statement
			int n= preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Unable to add trainers");
			}
			return "Trainer with trainer_id: "+trainer.getTrainer_id()+" added to the database";

		}catch(SQLException e) {			
			throw e;
		}catch(Exception e) {
			throw e;
		}

	}
	@Override
	public String deleteTrainer(Integer trainer_id) throws Exception {
		String sql= "delete from emp where empno=?";

		try{
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, trainer_id);
			int n= preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Unable to delete trainer");
			}
			return "Trainer_id: "+trainer_id+" deleted from database";
		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}
	}
	@Override
	public String updateTrainer(Trainer trainer) throws Exception {
		String sql= "update trainer_details set trainer_name=?,trainer_gender=?,dateofjoin=?,contact=? where trainer_id=?";

		try{
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			PreparedStatement preparedStatement= connection.prepareStatement(sql);	
			preparedStatement.setString(1, trainer.getTrainer_name());
			preparedStatement.setString(2, trainer.getTrainer_gender());
			preparedStatement.setDate(3, java.sql.Date.valueOf(trainer.getDateofjoin()));
			preparedStatement.setInt(4, trainer.getTrainer_contact());
			preparedStatement.setInt(5, trainer.getTrainer_id());
			
			int n= preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Unable to update trainer");
			}
			return "Trainer_id: "+trainer.getTrainer_id()+" record updated";
		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}
	}
}

	

