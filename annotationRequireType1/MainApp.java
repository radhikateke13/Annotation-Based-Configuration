package com.spring.annotationRequireType1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
		 ApplicationContext context = new ClassPathXmlApplicationContext(" com/spring/annotationRequireType1/applicationcontext.xml");
		 
		 Student student = (Student) context.getBean("student");
		 System.out.println("Name : " + student.getName() );
		 System.out.println("Age : " + student.getAge() );
		 }
		}

	
