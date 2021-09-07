package com.techment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
	//Get http method
	// http://localhost:8090/hello-world
	//get
	//post
	//put
	//delete
	
	@GetMapping("/hello-world")
	public String helloWorls() {
		return "Hello World";
	}

}
