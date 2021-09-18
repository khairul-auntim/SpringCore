package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefDriver {
	
	public static void main(String[] args) {
		System.out.println("Hello From The Driver");
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/reference/refconfig.xml");
		
		A tmp= (A) context.getBean("aref");
		
		System.out.println(tmp.getX());
		System.out.println(tmp.getObj().getY());
		System.out.println(tmp);
			
	}

}
