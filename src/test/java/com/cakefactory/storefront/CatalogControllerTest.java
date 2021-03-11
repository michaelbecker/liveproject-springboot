package com.cakefactory.storefront;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.beans.factory.annotation.Autowired;



@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CatalogControllerTest {

	@LocalServerPort
	private int port;
	
	@Test
	public void catalogPage() throws Exception {
		
	    try (final WebClient webClient = new WebClient()) {
	        final HtmlPage page = webClient.getPage("http://localhost:" + port + "/catalog");
	        Assertions.assertEquals("Cake Factory Catalog", page.getTitleText());

	        //final String pageAsXml = page.asXml();
	        //Assertions.assertTrue(pageAsXml.contains("<body class=\"composite\">"));
	        String expected = "This is a lit of the pastries available";
	        final String pageAsText = page.asText();
	        Assertions.assertTrue(pageAsText.contains(expected));
	    }
	}	
	
	
}
