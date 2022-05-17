package com.simplilearn.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simplilearn.webapp.bean.CustomEventPublisher;

@Controller
public class MainController {

	@RequestMapping(value = "/custom-event", method = RequestMethod.GET)
	public String eventMapping() {

		// logic to create and map custom
		// create a application context object
		ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");

		CustomEventPublisher publisher = context.getBean("customEventPublisher", CustomEventPublisher.class);
		publisher.publish();

		return "custom-event";
	}
}
