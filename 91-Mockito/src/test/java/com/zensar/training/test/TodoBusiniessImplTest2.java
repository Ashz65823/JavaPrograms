package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.isNull;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.zensar.training.bean.TodoBusniessImpl;
import com.zensar.training.bean.TodoService;

public class TodoBusiniessImplTest2 {
	
	@Test
	public void test()
	{
		TodoService todoService=Mockito.mock(TodoService.class);//we tell  mockito to class//-->will not consider implementation--- A dummy implemenataion is created-->create mock object to implement todoservice
		//proxy object is created --dummy impl is created
		TodoBusniessImpl busniessImpl=new TodoBusniessImpl(todoService);//passing mark object
		
		List<String> springRelatedTodos=busniessImpl.retrieveTodosRelatedToString("user1");//retrive 0 size so it will fail
		assertEquals(isNull(), springRelatedTodos.size());		
	}

}
