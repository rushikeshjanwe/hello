package com.rushikesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt
	       = new ClassPathXmlApplicationContext("beans.xml");
		
		State st=ctxt.getBean(State.class);
		st.getAll();
	}

}
