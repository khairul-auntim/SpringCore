package spring_core.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("spring_core/spring_core/config.xml");
        
        Student student1= (Student) context.getBean("std1");
        
        
        System.out.println(student1.getStudentAddresses());
        
    }
}
