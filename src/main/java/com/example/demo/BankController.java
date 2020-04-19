package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping("/Fourth")
	public String getFourth() {
		System.out.println("changed in Bank");
		System.out.println("changed in Bank");
		System.out.println("changed in Bank");
		return "Fourth";
	}
}
