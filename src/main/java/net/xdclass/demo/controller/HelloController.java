package net.xdclass.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.xdclass.bean.User;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		int m=1/0;
		return "hello";
	}
	
	
	@RequestMapping("/testJson")
	@ResponseBody
	public User json() {
		User user=new User();
		user.setAge(10);
		user.setPhone("17718535963");
		user.setPwd("456");
		user.setCreateTime(new Date());
		System.out.println("hello");
		return user;
		
	}
	
	

}
