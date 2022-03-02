package com.zensar.training.ui;

import java.util.function.Predicate;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main3 {
	static void demo1(Predicate<Square>predicate,Square s)
	{
		System.out.println("Demo\n---------------\n"+predicate.test(s));
	}
	static void demo2(Predicate<Square>predicate,Square s)
	{
		System.out.println("Demo\n---------------\n"+predicate.test(s));
	}
	static void demo3(Predicate<Student>predicate,Student s)
	{
		System.out.println("Demo\n---------------\n"+predicate.test(s));
	}
	static void demo4(Predicate<Student>predicate,Student s)
	{
		System.out.println("Demo\n---------------\n"+predicate.test(s));
	}
	
	public static void main(String[] args) {
		Predicate<Circle> predicate1;
		predicate1=(Circle c)->{
			if(c.getRadius()>100)
				return true;
			return false;
		};
		System.out.println(predicate1.test(new Circle(25)));
		predicate1=(Circle c2)->c2.getRadius()>100? true:false;
		System.out.println(predicate1.test(new Circle(45)));
		
		Predicate<String> predicate2;
		predicate2=(String s)->s.length()>10?true : false;
		System.out.println(predicate2.test("Zensar Training"));
		
		demo1((s)->s.getSize()>5?true:false, new Square(10));
		demo2((s)->s.calculateArea()>100?true:false, new Square(20));
		demo3((s)->s.getAverageMark()>60?true:false, new Student(101, "Aishu", Gender.FEMALE, 75, "Testing"));
		//demo3((s->s.getAverageMark()>60?true:false,new Student(101, "Hari", Gender.MALE, 59, "BE"));
		demo4((s)->s.getGender().equals(Gender.MALE)?true:false, new Student(101, "Hari", Gender.MALE, 59, "BE"));
		
	}
}
/*
 * This will take object and return boolean
 * 
 * */