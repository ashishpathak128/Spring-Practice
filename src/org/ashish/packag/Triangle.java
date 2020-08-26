package org.ashish.packag;

//import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean, Shape  {
	/* List<Point> points; */
   private Point pointA;
   private Point pointB;
   private Point pointC;
   //private String beanName;
   private ApplicationContext context;
   

	public Point getPointA() {
	return pointA;
}


public void setPointA(Point pointA) {
	this.pointA = pointA;
}


public Point getPointB() {
	return pointB;
}


public void setPointB(Point pointB) {
	this.pointB = pointB;
}


public Point getPointC() {
	return pointC;
}


public void setPointC(Point pointC) {
	this.pointC = pointC;
}


	public void draw() {
		System.out.println("Point  A "+ getPointA().getX()+" "+getPointA().getY());
		System.out.println("Point  B "+ getPointB().getX()+" "+getPointB().getY());
		System.out.println("Point  C "+ getPointC().getX()+" "+getPointC().getY());
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is " + beanName);
		
	}


	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Before Destroying");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Before init");
		
	}
	public void Myinit() {
		System.out.println("My Init");
	}
	public void Mydestroy() {
		System.out.println("My destroy");
	}
}
