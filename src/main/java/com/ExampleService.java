package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleService {
	
	@GetMapping("/sign/{number}")
	public String checkSign(@PathVariable int number) {
	if(number > 0)
        {
		return number+" is positive number";
        }
	else if(number < 0){
		return number+" is negative number";	
	}
        else {
            return number+" is neither positive nor negative";
        }	
	}
}
