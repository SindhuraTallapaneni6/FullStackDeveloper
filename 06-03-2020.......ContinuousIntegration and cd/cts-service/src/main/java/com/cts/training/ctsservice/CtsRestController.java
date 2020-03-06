package com.cts.training.ctsservice;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtsRestController {
	@GetMapping(value="/lang")
	public List<String> languages(){
		return new ArrayList<String>(Arrays.asList("java","tanu","python","Type Script","ruby","C Programming"));
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "Good Morning";
	}
	
	

}
