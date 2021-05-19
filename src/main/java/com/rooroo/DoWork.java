package com.rooroo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rooroo.thread.DemoService;

public class DoWork {
	
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		
		DemoService service=ac.getBean(DemoService.class);
		service.a();
		service.b();
		
	}

}
