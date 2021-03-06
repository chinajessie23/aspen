package com.hoticket.service;


import com.hoticket.dao.UserDAO;
import com.hoticket.modal.Customer;
import com.hoticket.modal.User;
import com.hoticket.util.EncryptUtils;

public class RegisterService {
	UserDAO userDao = new UserDAO();
	/**
	 * check if the email already exists in the db 
	 * @param email address that user input for registration
	 * @param users all the users in the db
	 * @return	true, email not be registered yet
	 * 			false, email already exists
	 */
	public boolean verifyRegister(User user) {
		User user1=userDao.checkUser(user.getEmail());
			if(user1==null)return true;
			else return false;
	}
	public Customer addCustomer(User user) {
        Customer u3 = new Customer();
	    u3.setEmail(user.getEmail());
	    u3.setUser_name(user.getUser_name());
		//encrypt user password here
	    u3.setPassword(EncryptUtils.base64encode(user.getPassword()));
	    u3.setRole(0);
	    u3.setGender(1);
        userDao.addCustomer(u3);
		return u3;
	}

}
