package com.zensar.training.bean;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	@Override
	public List<String> retriveTodos(String user) {
		if(user.equals("user1"))
		return Arrays.asList("Learn Spring MVC", "Learn Spring ","Learn to Dance");
		
		if(user.equals("user2"))
			return Arrays.asList("Learn Java","Learn HTML","Learn Css");
		
		return null;
		
	}

}
