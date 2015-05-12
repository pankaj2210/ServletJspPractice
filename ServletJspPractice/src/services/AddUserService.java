package services;

import beans.UserBean;
import dao.UserDao;

public class AddUserService {
	
	public void addUser(UserBean user){
		UserDao userDao = new UserDao();
		
		//Check if user already exists
		//TODO
		
		//Add User to DB
		userDao.addUser(user);
 	}	
}
