package org.ashish.packag;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;


public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	private MessageSource mSource;
	private ApplicationEventPublisher publisher;
	
	public MessageSource getmSource() {
		return mSource;
	}
	@Autowired
	public void setmSource(MessageSource mSource) {
		this.mSource = mSource;
	}
	public Point getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		//System.out.println("Drawing  circle with the center " + center.getX() + ", "+ center.getY());
		System.out.println(this.mSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "defaulft drw", null));
		System.out.println(this.mSource.getMessage("greeting", null, "Deafult 2", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}

}
