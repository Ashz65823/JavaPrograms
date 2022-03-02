package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;

public class ArrayListTester {
	
	@Test
	@DisplayName("Java Build in Interface")
	public void test1(){
	List<String> mockedList1=Mockito.mock(ArrayList.class);
	mockedList1.add("one");
	mockedList1.add("two");
	Mockito.when(mockedList1.size()).thenReturn(2);
	assertEquals(2, mockedList1.size());
	}
	
	@Test
	@DisplayName("Spy object creation")
	public void test2()
	{
		
		List<String> spyList=Mockito.spy(ArrayList.class);//empty collection
		spyList.add("one");
		spyList.add("two");
		//Mockito.verify(spyList).add("one");
		assertEquals(2, spyList.size());
	}
}
/*mock object is  not working on real object
 * when call is not needed in spy
 * spy object will create real object any operation will be add to real object
 * and we are asserting on real object.. 
 * In mock list we where operating on dummy object
 *  */

