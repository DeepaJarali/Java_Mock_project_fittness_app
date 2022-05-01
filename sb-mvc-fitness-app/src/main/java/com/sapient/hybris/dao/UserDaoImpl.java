package com.sapient.hybris.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.sapient.hybris.model.User;

/*
 * CREATE TABLE users (
  userid int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  password varchar(64) NOT NULL,
  role varchar(45) NOT NULL,
  enabled tinyint(4) ,
  PRIMARY KEY (userid)
);

//password "admin@123" is BCrypted
INSERT INTO users (username,password,role,enabled)
VALUES ('admin',
'$2a$10$ER0itTT53r5OQQbhyf5SFO9HxkGaAm5Wc5IsraCSToewDPziY7CG2',
'USER', 1);
 
 
 //password "user@123" is BCrypted
INSERT INTO users (username,password,role,enabled)
VALUES ('user',
'$2a$10$cIgZk.DXoe1tCN5dc0T0Lu1W2w.uNtSj1FdOyfGUUP/mYdig8UGA6',
'ADMIN', 1);
 */

@Repository
public class UserDaoImpl implements UserDAO{
	@Autowired
	private DataSource dataSource;
	

	@Override
	public Boolean isValidCredentials(String username, String password) throws Exception {
		String sql= "select username, password from users where username=?";
		try{		

			Connection connection=dataSource.getConnection();

			PreparedStatement preparedStatement= connection.prepareStatement(sql);	
			
			preparedStatement.setString(1, username);
//			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();			
			
			//When we execute query, the results are stored ResultSet object
			//From the ResultSet object we need read into our variables
			//returns either 0 or 1 row
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {	
				return true;				
			}else {
				return false;
			}
			

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw e;
		}
		
	}

	@Override
	public String addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Integer userid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePassword(Integer userid, String oldPassword, String newPassword) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
