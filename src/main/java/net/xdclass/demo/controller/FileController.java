package net.xdclass.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@PropertySource(value = {"application.properties"})
public class FileController {
	
	@RequestMapping(value = "/api")
	public String index() {
		return "index";
	
	}
	@Value("${web.upload.path}")
	private String uploadPath;
	
	@RequestMapping("/upload")
	@ResponseBody
	public String getResources() {
		return uploadPath;
	}
	
	

}
