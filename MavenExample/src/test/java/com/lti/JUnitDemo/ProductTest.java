package com.lti.JUnitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testcompanyName() {
		Product p = new Product(101, "Charger", 1000.0, "Dmart");
		Assertions.assertEquals("Dmart", p.getCompanyName());
	}

}
