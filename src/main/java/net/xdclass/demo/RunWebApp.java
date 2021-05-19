package net.xdclass.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
public class RunWebApp {
	
	public static void main(String[] args) {
		SpringApplication.run(RunWebApp.class);
	}

}
