package com.zensar.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;

@Configuration//it will pick up object from here and inject it where it needed
public class MyConfig1 {
	
	//@Bean(name="studBean")//equal to configuring and student bean using xml
	@Bean//if bean does not have name// student will be bean name here
	public Student f1()
	{
		return new Student();//create student object and return student object
	}
	
	@Bean(name="empBean")
	public Employee employee()
	{
		Employee employee=new Employee(101, "Ash", 12000.00, f2());
		//employee.setAddress(f2());//f2 injecting of function is not needed
		return employee;//gets auto wired from emp object
	}
	
	@Bean(name="addressBean")
	public Address f2()
	{
		Address address=new Address();
		address.setDoorNo("362/b");
		address.setAreaName("JB Nagar");
		address.setCity("Bangalore");
		
		return address;
	}
	
}
