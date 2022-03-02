package com.zensar.training.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zensar.training.bean.LoginUser;
import com.zensar.training.db.LoginUserDAO;

@Service//@Service: It is also used at class level. It tells the Spring that class contains the business logic.
public class LoginServiceImpl implements UserDetailsService {
	
	@Autowired
	LoginUserDAO loginUserDAO;
	
	//add user into db
	public LoginUser addLoginUser(LoginUser loginUser)
	{
		return this.loginUserDAO.save(loginUser);
	}//save user login

	public LoginUser findLoginUserByName(String name)
	{
		return this.loginUserDAO.findByName(name);//get login user object
	}//finding login user--and  return loginuser
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginUser loginUser=findLoginUserByName(username);
		User user =new User(loginUser.getName(), loginUser.getPassword(), new ArrayList());//array list repressing role to be performed
		return user;//user is identified here
	}//--string will be password for given username, have to find password 
}
