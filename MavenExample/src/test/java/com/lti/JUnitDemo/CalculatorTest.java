package com.lti.JUnitDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class CalculatorTest {

	@Test
	void testAddCalc() {
		int r = Calculator.add(100, 200);
		Assertions.assertEquals(300, r);
		Assertions.assertNotEquals(500, Calculator.add(20, 30),"Testin add method");
	}
	
	@Disabled
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("Akash".length()==15);
	}
	
	@Disabled
	@Test
	void testAssertNull() {
		String s1 = "Harshali";
		Assertions.assertNotNull(s1);
	}
	
	/*
	 * @Disabled
	 * 
	 * @Test void testAssertLambda() { String s1 = "Harshali"; String s2 =
	 * "Malgundkar"; Assertions.assertAll("data", ()-> Assertions.assertEquals(s1,
	 * "Harshali"), ()-> Assertions.assertEquals(s2, "Malgundkar") ); }
	 */
	
	/*
	 * @Disabled
	 * 
	 * @Test void testCollections() { ArrayList <String> myList = new ArrayList<>();
	 * myList.add("Hello"); Assertions.assertFalse(myList.isEmpty());
	 * 
	 * ArrayList <Integer> myList1 = new ArrayList<>();
	 * Assertions.assertEquals(true, myList1.isEmpty()); }
	 */
	
	
	@BeforeAll
    static void setup(){
        System.out.println("only once in beg - @BeforeAll executed\n");
    }     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }      
    @Test
    void testCalcOne() 
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }  
    //@Disabled
    @Test
    void testCalcTwo() 
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }    
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }     
    @AfterAll
    static void tear(){
        System.out.println("\n once aat the end - clean up @AfterAll executed");
    }
	

}
