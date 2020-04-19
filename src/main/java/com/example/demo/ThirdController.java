package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdController {

	@GetMapping("/Third")
	public String getThird() {
		return "ThirdPage";
	}
}
