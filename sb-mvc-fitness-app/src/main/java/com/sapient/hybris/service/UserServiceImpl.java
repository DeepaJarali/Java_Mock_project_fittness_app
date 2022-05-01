package com.sapient.hybris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.hybris.dao.UserDAO;
import com.sapient.hybris.model.User;

@Service
//Transaction management is taken care by Spring framework
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDao;

	@Override
	public Boolean isValidCredentials(String username, String password) throws CredentialException {
		try {
			return userDao.isValidCredentials(username, password);
		}catch(CredentialException e) {
			throw e;
		}catch(Exception e) {
			throw new CredentialException(e.getMessage());
		}
	}

	@Override
	public String addUser(User user) throws CredentialException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Integer userid) throws CredentialException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePassword(Integer userid, String oldPassword, String newPassword) throws CredentialException {
		// TODO Auto-generated method stub
		return null;
	}

}
