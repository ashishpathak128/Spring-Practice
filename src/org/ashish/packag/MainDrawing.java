package org.ashish.packag;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDrawing {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("Spring.xml");
		Shape shape = (Shape) factory.getBean("circle");
		factory.registerShutdownHook();
		shape.draw();
		System.out.println(factory.getMessage("greeting", null, "defaultMessage", null));
		factory.close();
	}

}
