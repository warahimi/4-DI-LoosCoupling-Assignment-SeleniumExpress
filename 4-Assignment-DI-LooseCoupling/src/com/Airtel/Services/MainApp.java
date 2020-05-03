package com.Airtel.Services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Airltel artl = context.getBean("airtelServices", Airltel.class);
		artl.activateService();
	}

}
