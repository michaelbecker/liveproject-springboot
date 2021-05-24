package com.cakefactory.storefront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class BasketController {

	public BasketController() {
		
	}

	@PostMapping(path = "/basket", consumes = "application/x-www-form-urlencoded")
	public String postBasket(@RequestParam String id) {
		
		System.out.println("We are in postBasket");
		
		System.out.println("id = " + id);
		
		return "redirect:/catalog";
	}
	
	
}
