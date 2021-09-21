package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireDriver {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("autowire/config.xml");
		System.out.println(context.getBean("person"));
	}

}
