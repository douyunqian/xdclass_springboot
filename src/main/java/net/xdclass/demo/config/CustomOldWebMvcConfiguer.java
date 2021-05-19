package net.xdclass.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import net.xdclass.demo.interceptors.LoginInterceptors;
import net.xdclass.demo.listener.ApiListener;

@Configuration
public class CustomOldWebMvcConfiguer  implements  WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
//		WebMvcConfigurer.super.addInterceptors(registry);
//		registry.addInterceptor(interceptor);
		System.out.println("加载拦截器");
		registry.addInterceptor(new LoginInterceptors()).addPathPatterns("/*");
		
		
	}

	

			
}
