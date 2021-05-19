package net.xdclass.demo.contextlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyContextListener   implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
//		ServletContextListener.super.contextInitialized(sce);
		System.out.println("Context Init");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
//		ServletContextListener.super.contextDestroyed(sce);
		System.out.println("Context Load");
	}

	
	
}
