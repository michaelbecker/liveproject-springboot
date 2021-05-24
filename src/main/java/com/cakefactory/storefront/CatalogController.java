/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cakefactory.storefront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author Mike
 */
@Controller
public class CatalogController {
    
	public final PastryRepository pastryRepository;
	
	@Autowired
	public CatalogController(PastryRepository pr) {
		
		pastryRepository = pr;
/*
		pr.saveAll(List.of(	new Pastry("abcr", "All Butter Croissant", 0.75),
				new Pastry("ccr", "Chocolate Croissant", 0.95),
				new Pastry("b", "Fresh Baguette", 1.60),
				new Pastry("rv", "Red Velvet", 3.95),
				new Pastry("vs", "Victoria Sponge", 5.45),
				new Pastry("cc", "Carrot Cake", 3.45)
				));
*/	

	}
	
    @GetMapping("/catalog")
    public String showCatalog(Model model) {

    	// Debug bit...
    	/*
        System.out.println("DEBUG - We're in showCatalog()");
        for (Pastry p : pastryRepository.findAll()) {
        	System.out.println("Found a " + p.toString());
        }
        */
        
    	model.addAttribute("pastry", pastryRepository.findAll());
        
        return "catalog";
    }
    
}
