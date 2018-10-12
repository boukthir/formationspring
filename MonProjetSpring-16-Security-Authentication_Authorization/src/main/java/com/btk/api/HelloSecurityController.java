package com.btk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSecurityController {
	
	@GetMapping("/secret")
	public String actionSecrete() {
		
		return "Ceci est un secret";
	}

	
	@GetMapping("/public")
	public String actionPublic() {
		
		return "Ceci est permis";
	}

	
}
