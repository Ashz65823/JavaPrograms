package com.zensar.messageapi.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zensar.messageapi.enity.ZensarUser;
import com.zensar.messageapi.repository.ZensarUserRepository;

@Service
public class ZensarUserDetailsServiceImpl implements UserDetailsService {

	@Autowired // Dependence injection
	private ZensarUserRepository repo;

	@Override
	// UserDetails is an interface given by spring security import line 3
	// We are free to implement the interface but for simplicity Spring security has
	// given a class
	// Which implements user detail interface
	// Name of the class is User
	// So in this method we need to create object of User and return it
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Talk to DB and fetch UserDetails
		ZensarUser foundUser=repo.findByUsername(username);//findBy is the conversion made by springtool
		if(foundUser==null)
		{
			throw new UsernameNotFoundException(username);//if username not found exception 
		}
		System.out.println("In loadUserByUsername");
		System.out.println("User logged in successfully");
		/*if (username.equals("zensar")) {*/
			User authenticatedUser = new User(foundUser.getUsername(),foundUser.getPassword(),
					AuthorityUtils.createAuthorityList("ROLE_USER"));

		return authenticatedUser;
		//}
		//throw new UsernameNotFoundException(username);
	}

}
