package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import com.zensar.training.bean.TodoBusniessImpl;
import com.zensar.training.bean.TodoServiceStub;

public class TodoBusinessImplTest {

	@Test//test should always be from org.junit.test
	public void test()
	{
		TodoServiceStub todoService=new TodoServiceStub();
		TodoBusniessImpl busniessImpl=new TodoBusniessImpl(todoService);
		
		List<String> springReaList=busniessImpl.retrieveTodosRelatedToString("user1");//invoke todoBusniessImpl
		assertEquals(2, springReaList.size());//we have two spring in TodobusinessImpl
	
		List<String> springReaList2=busniessImpl.retrieveTodosRelatedToString("user2");//invoke todoBusniessImpl
		assertEquals(0, springReaList2.size());
	
	}
	
}
