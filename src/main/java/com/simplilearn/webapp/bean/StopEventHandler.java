package com.simplilearn.webapp.bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;


//Event raised when an ApplicationContext is stopped.
public class StopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Application Context stoped event is received !");		
	}

}
