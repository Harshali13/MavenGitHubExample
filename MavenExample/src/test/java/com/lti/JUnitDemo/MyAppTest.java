package com.lti.JUnitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.myApp;

class MyAppTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */
	
	@Test
	void showTest() {
		myApp m = new myApp();
		String s = m.show();
		//System.out.println(s);
		Assertions.assertEquals("hello maven", s);
	}

}
