package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanGiver.class);
		Car c=(Car) context.getBean("Army");
		c.setName("q2");
		System.out.println(c.getName());
		c.party();
		 
		
	}

}
