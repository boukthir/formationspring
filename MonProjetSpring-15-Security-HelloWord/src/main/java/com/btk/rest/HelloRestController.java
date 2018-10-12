package com.btk.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	
	@GetMapping("/word")
	public String hello()
	{
		return "Hello , Asslma,Bonjour";
	}

}
