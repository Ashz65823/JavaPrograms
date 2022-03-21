package com.zensar.messageapi.jwt.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class JwtAuthenticationFilter extends BasicAuthenticationFilter {
	private String authorizationHeader="Authorization";
/*
 * This is custom filter
 * You will need to add this filter in spring security filter chain otherwise it is not excuted */
	public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
		
	}
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/*
		 * 1 Check if user have passed token, we do that by fetching value from authorization header
		 * 2 if token not present ask use to login
		 * 3 if token present fetch it and validate it
		 * */
		//1
		System.out.println("------------------------------------------------------------");
		String authorizationHeaderValue=request.getHeader(authorizationHeader);
		
		
		if(authorizationHeaderValue!=null && authorizationHeaderValue.startsWith("Bearer "))
		{
			String token=authorizationHeaderValue.substring(7);
			if(token!=null)
			{
				//Bearer and tocken
				System.out.println("authorizationHeaderValue= "+authorizationHeaderValue);
				System.out.println("Token value= "+token);
			}
			
			
		}
		chain.doFilter(request, response);
		
	}


}
