package com.cakefactory.storefront;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
import org.springframework.boot.web.server.LocalServerPort;



@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CatalogControllerTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private PastryRepository pastryRepository;
	
	@BeforeEach
	public void setUp() {
		pastryRepository.saveAll(List.of(	
				new Pastry("abcr", "All Butter Croissant", 0.75),
				new Pastry("ccr", "Chocolate Croissant", 0.95),
				new Pastry("b", "Fresh Baguette", 1.60),
				new Pastry("rv", "Red Velvet", 3.95),
				new Pastry("vs", "Victoria Sponge", 5.45),
				new Pastry("cc", "Carrot Cake", 3.45)
				));
	}
	
	@AfterEach
	public void tearDown() {
		pastryRepository.deleteAll();
	}
	
	
	@Test
	public void intialCatalogPage() throws Exception {
		
	    try (final WebClient webClient = new WebClient()) {
	        final HtmlPage page = webClient.getPage("http://localhost:" + port + "/catalog");
	        Assertions.assertEquals("Cake Factory Catalog", page.getTitleText());

	        //final String pageAsXml = page.asXml();
	        //Assertions.assertTrue(pageAsXml.contains("<body class=\"composite\">"));
	        String expected = "This is a lit of the pastries available";
	        final String pageAsText = page.asText();
	        Assertions.assertTrue(pageAsText.contains(expected));
	        
	        Assertions.assertTrue(pageAsText.contains("All Butter Croissant"));
	        Assertions.assertTrue(pageAsText.contains("Chocolate Croissant"));
	        Assertions.assertTrue(pageAsText.contains("Fresh Baguette"));
	        Assertions.assertTrue(pageAsText.contains("Red Velvet"));
	        Assertions.assertTrue(pageAsText.contains("Carrot Cake"));
	    }
	}	
	
	
}
