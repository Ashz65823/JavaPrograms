package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Executable3;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Student;

public class Main5 {
public static void main(String[] args) {
	Executable3<String> executable3;
	executable3=(s)->{
		return s.length();
	};
	System.out.println(executable3.execute("Swetha"));
	
	Executable3<Double>executable32;
	executable32=(obj)->obj.intValue();//will return an integer value
	System.out.println(executable32.execute(234.90));
	
	Executable3<Float> executable33;
	executable33=(obj)->obj.intValue();
	System.out.println(executable33.execute(147.08f));
	
	Executable3<Circle>executable34;
	executable34=(obj)->obj.getRadius();
	System.out.println(executable34.execute(new Circle(45)));
	
	Executable3<Student>executable35;
	executable35=(obj)->obj.getRollNo();
	System.out.println(executable35.execute(new Student(201)));
	
	Executable3<Rectangle>executable36;
	executable36=(obj)->obj.getArea();
	System.out.println(executable36.execute(new Rectangle(5,7)));
	}
	 

}
