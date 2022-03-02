package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student;
		student = (Student) context.getBean("stud");// bean instance for Student will be student (small s)
		System.out.println(student);

		Square square;
		square = (Square) context.getBean("sqr");

		Circle circle;
		circle = (Circle) context.getBean("cir");

		System.out.println(square);
		System.out.println(circle);
		//bean name is cir sqr and stud
		
		System.out.println("\n<<<<<<<<<<<<<<<<<<<Employee>>>>>>>>>>>>>>>>>>>");
		
		Employee employee=(Employee) context.getBean("employee");//bean name is employee
		employee.setId(101);
		employee.setName("John");
		employee.setSalary(10000.00);
		System.out.println(employee.getAllowance());
		System.out.println(employee.getDeduction());//since auto-wired this 2 method will automatically work for aGradeSalCal 
	}
}
/*
 * when we have SalaryCalculator interface of salaryCalculator then we need to specify the @qualifier of either bGradeSalCal or AGradeSalCal
 * to auto wire
 * */
