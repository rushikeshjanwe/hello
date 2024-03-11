package com.rushikesh;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		 */
     
     ApplicationContext context =
				new ClassPathXmlApplicationContext("spring-beans.xml");
     
		
     Hierarchy h1=context.getBean(Hierarchy.class); 
		  h1.getValues();
		   

	}

}
