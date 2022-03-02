package com.zensar.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.bean.LoginRequest;
import com.zensar.training.bean.LoginResponse;
import com.zensar.training.bean.LoginUser;
import com.zensar.training.security.util.JwtUtil;
import com.zensar.training.service.LoginServiceImpl;


@RestController//@RestController: It can be considered as a combination of @Controller and @ResponseBody annotations. The @RestController annotation is 
//itself annotated with the @ResponseBody annotation. It eliminates the need for annotating each method with @ResponseBody.
public class LoginUserController {
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@PostMapping("/addUser")
	public LoginUser add(@RequestBody LoginUser loginUser) {
		return this.loginServiceImpl.addLoginUser(loginUser);
	}//use service implementation --adding some use
	
	@GetMapping("/findUser/{name}")//the {name}is path variable when we browse we give exact name to extract info that is path variable 
	public LoginUser findLoginUserByName(@PathVariable(name="name")String name)//the path variable and path annotation should be same
	{
		return this.loginServiceImpl.findLoginUserByName(name);
	}//return object to user//returning some user
	
	@PostMapping("/authenticate")
	public LoginResponse createToken(@RequestBody LoginRequest loginRequest)
	{
		UsernamePasswordAuthenticationToken authUserPass;
		authUserPass=new UsernamePasswordAuthenticationToken(loginRequest.getUserName(), loginRequest.getPassword());
		this.authenticationManager.authenticate(authUserPass);
		
		UserDetails userDetails;
		userDetails=loginServiceImpl.loadUserByUsername(loginRequest.getUserName());
		String jwtStr=jwtUtil.generateToken(loginRequest.getUserName());
		return new LoginResponse(jwtStr);
	}
}
