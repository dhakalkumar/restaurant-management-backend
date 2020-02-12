package com.restaurant.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestaurantController {

	@GetMapping("/")
	public String getIndex() {
		
		return "index";
	}
	
}
