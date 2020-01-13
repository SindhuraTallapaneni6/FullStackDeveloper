package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.main.Calculator;


public class CalculatorTest {
	
Calculator calculator;
@Before
public void init1()
{
	 calculator=new Calculator();
	System.out.println("calculator object created");
}
@After 
public void init()
{
	calculator=null;
	System.out.println("calculator object destroyed");
}
@Test
public void AddNumbers() {
	assertEquals(6,alculator.add(2, 3));
}
@Test
public void SubNumbers() {
	assertEquals(-1,calculator.sub(2, 3));
}

}
 