package com.btk.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello") // si j'ai ecrit au navigateur /hello il va me retourner "Hello, Bonjour, Salem"
	public String sayHello() {
		return "Hello, Bonjour, Salem";
	}

}
