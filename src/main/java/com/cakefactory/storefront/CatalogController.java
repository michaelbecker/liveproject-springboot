/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cakefactory.storefront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author Mike
 */
@Controller
public class CatalogController {
    
    @GetMapping("/catalog")
    public String showCatalog() {
        System.out.println("DEBUG - We're in showCatalog()");
        return "catalog";
    }
    
}
