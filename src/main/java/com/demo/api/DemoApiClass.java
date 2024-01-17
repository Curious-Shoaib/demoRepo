package com.demo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping("/demo")
public class DemoApiClass {
	
	@GetMapping("/")
	public ResponseEntity<String> Method() 
	{
		
		return new ResponseEntity<>("Hi, WElcome to demo app" ,HttpStatus.OK);
	}

}
