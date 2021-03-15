package com.cakefactory.storefront;


import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PastryTest {
	
	@Test
	public void testPastry() {
		Pastry p = new Pastry();
		p.setId("att");
		p.setDescription("A Tasty Treat");
		p.setPrice(1.23);

		Assertions.assertEquals("att", p.getId());
		Assertions.assertEquals("A Tasty Treat", p.getDescription());
		Assertions.assertEquals(1.23, p.getPrice());
	}

}
