package com.pocketstars.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("test")
	public String testDemo(){
		return "this is s test demo,if you get this info that means this springboot project functions well in you computer!";
	}
}
