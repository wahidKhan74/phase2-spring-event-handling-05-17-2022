package com.simplilearn.webapp.bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

//Event raised when an ApplicationContext gets started.
public class StartEventHandler  implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Application Context start event is received !");		
	}

}
