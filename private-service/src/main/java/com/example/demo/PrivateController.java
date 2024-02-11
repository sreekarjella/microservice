package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateController {

	@GetMapping(path = "/internal")
	public String privateAPI() {
		return "Data coming from internal service";
	}
}
