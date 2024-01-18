package com.cos.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	
	@GetMapping("/test")
	public String testAbc() {
		return "<h1>hello</h1>";
	}
}
