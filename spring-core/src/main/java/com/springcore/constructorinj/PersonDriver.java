package com.springcore.constructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/constructorinj/ciconfig.xml");
		
		Person p1=(Person) context.getBean("person1");
		
		System.out.println(p1);

	}

}
