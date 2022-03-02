package com.zensar.training.ui;

import java.time.LocalDate;
import java.util.function.Consumer;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main1 {
	public static void main(String[] args) {
		Consumer<String> consumer1;
		consumer1=(String s)->{
			System.out.println(s.length());
		};
		
		consumer1.accept("Zensar");
		
		Consumer<String> consumer2=(s)->System.out.println(s.toUpperCase());
		consumer2.accept("training");
		
		Consumer<Integer>consumer3=(i)->System.out.println(i.doubleValue());
		consumer3.accept(679);
		
		Consumer<Circle>consumer4=(c)->System.out.println(c.computeArea());
		consumer4.accept(new Circle(10));
		
		Consumer<Square>consumer5=(s)->System.out.println(s.calculateArea());
		consumer5.accept(new Square(20));
		
		Consumer<Circle>consumer6=(c)->System.out.println(c.getDiameter());
		consumer6.accept(new Circle(10));
		
		Consumer<Employee>consumer7=(e)->System.out.println(e.toString());
		Employee employee=new Employee(5001, "Ashwini", 'A', LocalDate.now(), 1000, Gender.FEMALE);
		consumer7.accept(employee);
		
		Consumer<Employee>consumer8=(e)->System.out.println("Basic Salary= "+e.getBasicSalary()+" , Allowance= "+e.computeAllowance());
		//Employee employee2=new Employee(5002, "Uday", 'A', LocalDate.now(), 5000, Gender.MALE);//this can be used as well insted of employee
		consumer8.accept(employee);
		
		Consumer<Student>consumer9=(s)->System.out.println(s.getAverageMark());
		Student student= new Student(101, "Ashwini", Gender.FEMALE, 450, "BCA");
		consumer9.accept(student);
		
		Consumer<Rectangle> consumer10=(r)->System.out.println(r.getArea());
		consumer10.accept(new Rectangle(6, 9));
		
		Consumer<Student>consumer11=(s->System.out.println(s.computeGrade()));
		consumer11.accept(student);
		
	}
}
/*
 * Accept is an abstract method in Consumer class
 * Accept return void */
 