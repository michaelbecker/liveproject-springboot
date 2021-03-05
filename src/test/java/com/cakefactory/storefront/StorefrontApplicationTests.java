package com.cakefactory.storefront;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StorefrontApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}


	@Test
	void assertThisIsFalse() {
		Assertions.assertFalse(false);
	}

}
