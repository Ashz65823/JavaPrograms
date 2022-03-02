package com.zensar.training;

import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;
import com.zensar.training.config.MyConfig1;

public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig1.class);
    
    //Student student=(Student) context.getBean("studBean");
    Student student=(Student) context.getBean("f1");//if name is not given in bean class
    System.out.println(student);
    
    Employee employee=(Employee) context.getBean("empBean");
    System.out.println(employee);
    
  }
  /*spring will look into config class and return bean
   * is equal applicationContext.xml file
   * */
  
}
