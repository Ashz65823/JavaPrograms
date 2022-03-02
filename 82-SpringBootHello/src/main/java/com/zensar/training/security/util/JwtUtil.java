package com.zensar.training.security.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
/*
 * It is used to mark a Java class as a bean
 * 
 * @Component is found during the classpath. The Spring Framework pick it up and
 * configure it in the application context as a Spring Bean.
 */
public class JwtUtil {

	@Value("${jwt.secret}")
	String secret;

	public String generateToken(String userName) {
		Map<String, Object> claims = new HashMap<>();
		return createToken(claims, userName);
	}// create token

	private String createToken(Map<String, Object> claims, String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 10)))
				.signWith(SignatureAlgorithm.HS256, secret).compact();// built in function to create token this is
																		// called by generate token internal creatToken
																		// is called

	}// generating token
		// from 22 to 36 its responsible for token creation and validation
		// the purpose of token --/getAll in postman we don't have user name and
		// password we authenticate
		// spring will create a token --we use then in header authentication

	// these are the constructor from super class

	public Claims extractAllClaims(String token) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
	}

	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}

	public String extractUserName(String token) {
		return extractClaim(token, Claims::getSubject);
	}

	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}// check the expiration data

	public boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

	public boolean validateToken(String token, UserDetails details) {
		String username = extractUserName(token);
		return username.equals(details.getUsername()) && !isTokenExpired(token);
	}
}
