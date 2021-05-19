package net.xdclass.demo.device;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerAdevice {
	
	@ExceptionHandler(value = Exception.class)
	Object handlerException(Exception e,HttpServletRequest request) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("code", "100");
		map.put("msg", e.getMessage());
		map.put("url",request.getRemoteHost());
		return map;
		
	}

}
