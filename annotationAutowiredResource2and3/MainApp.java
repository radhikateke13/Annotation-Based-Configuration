package com.spring.annotationAutowiredResource2and3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
	
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotationAutowiredResource2and3/applictioncontext.xml");
		 TextEditor te = (TextEditor) context.getBean("textEditor");
		// te.spellcheck();
		 te.getSpellChecker();
		// System.out.println(te.getSpellChecker());
		 }
		}

	
