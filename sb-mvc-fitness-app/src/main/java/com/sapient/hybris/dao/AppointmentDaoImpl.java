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

import com.sapient.hybris.model.Appointment;

@Repository
public class AppointmentDaoImpl implements AppointmentDAO {

	@Autowired
	private DataSource dataSource;

	@Override
	public Appointment getAppointmentById(Integer training_appointment_id) throws Exception {
		String sql= "select * from training_appointment where training_appointment_id= ?";
		try{	
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			PreparedStatement preparedStatement= connection.prepareStatement(sql);	
			preparedStatement.setInt(1, training_appointment_id);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				
				Appointment appointment= new Appointment();
				populateAppointment(resultSet, appointment);
				return appointment;
			}else {
				throw new SQLException("Invalid training_appointment_id");
			}

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
	}
	}
	private void populateAppointment(ResultSet resultSet, Appointment appointment) throws SQLException {
		appointment.setTraining_appointment_id(resultSet.getInt("training_appointment_id"));
		appointment.setFirst_name(resultSet.getString("first_name"));
		appointment.setLast_name(resultSet.getString("last_name"));
		appointment.setAddress(resultSet.getString("address"));
		appointment.setEmail(resultSet.getString("email"));
		appointment.setAge(resultSet.getInt("age"));
		//java.sql.Date -> java.time.LocalDate
		appointment.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
		appointment.setGender(resultSet.getString("gender"));
		appointment.setContact(resultSet.getLong("contact"));
		appointment.setTraining_start_date(resultSet.getDate("training_start_date").toLocalDate());
		appointment.setTraining_end_date(resultSet.getDate("training_end_date").toLocalDate());
		appointment.setPhysio(resultSet.getString("physio"));
		appointment.setTraining_package_amount(resultSet.getDouble("training_package_amount"));
	}

	@Override
	public List<Appointment> getAppointment() throws Exception {
		String sql= "select * from training_appointment";
		try{
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			Statement statement= connection.createStatement();
			ResultSet resultSet= statement.executeQuery(sql);
			List<Appointment> appointmentList= new ArrayList<>();
			while(resultSet.next()) {
				Appointment appointment= new Appointment();
				populateAppointment(resultSet, appointment);
				appointmentList.add(appointment);
			}

			if(appointmentList.isEmpty()) {
				throw new SQLException("Table is empty");
			}
			return appointmentList;

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}

	}


	@Override
	public String addAppointment(Appointment appointment) throws Exception {
		String sql= "insert into training_appointment values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try{
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			PreparedStatement preparedStatement= connection.prepareStatement(sql);	
			//replace place holders with corresponding fields of employee object
			preparedStatement.setInt(1, appointment.getTraining_appointment_id());
			preparedStatement.setString(2, appointment.getFirst_name());
			preparedStatement.setString(3, appointment.getLast_name());
			preparedStatement.setString(4, appointment.getAddress());
			preparedStatement.setString(5, appointment.getEmail());
			preparedStatement.setInt(6, appointment.getAge());
			//java.time.LocalDate to java.sql.Date
			preparedStatement.setDate(7, java.sql.Date.valueOf(appointment.getBirthdate()));
			preparedStatement.setString(8, appointment.getGender());
			preparedStatement.setLong(9, appointment.getContact());    
			preparedStatement.setDate(10, java.sql.Date.valueOf(appointment.getTraining_start_date()));
			preparedStatement.setDate(11, java.sql.Date.valueOf(appointment.getTraining_end_date()));
			preparedStatement.setString(12, appointment.getPhysio());
			preparedStatement.setDouble(13, appointment.getTraining_package_amount());
			//execute the DML statement
			int n= preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Unable to add appointments");
			}
			return "appointment with training_appointment_id: "+appointment.getTraining_appointment_id()+" added to the database";

		}catch(SQLException e) {			
			throw e;
		}catch(Exception e) {
			throw e;
		}

	}


	@Override
	public String deleteAppointment(Integer training_appointment_id) throws Exception {
		String sql= "delete from training_appointment where training_appointment_id=?";

		try{
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, training_appointment_id);
			int n= preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Unable to delete appointment");
			}
			return "Training_appointment_id: "+training_appointment_id+" deleted from database";
		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}
	}


	@Override
	public String updateAppointment(Appointment appointment) throws Exception {
		String sql= "update training_appointment set first_name=?,last_name=?,birthdate=?,contact=? where training_appointment_id=?";

		try{
			//Connection connection=dataSource.getConnection();
			Connection connection= DataSourceUtils.getConnection(dataSource);
			PreparedStatement preparedStatement= connection.prepareStatement(sql);	
			preparedStatement.setString(1, appointment.getFirst_name());
			preparedStatement.setString(2, appointment.getLast_name());
			preparedStatement.setDate(3, java.sql.Date.valueOf(appointment.getBirthdate()));
			preparedStatement.setLong(4, appointment.getContact());
			preparedStatement.setInt(5, appointment.getTraining_appointment_id());
			
			int n= preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Unable to update appointment");
			}
			return "Training_appointment_id: "+appointment.getTraining_appointment_id()+" record updated";
		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}
	}
}

