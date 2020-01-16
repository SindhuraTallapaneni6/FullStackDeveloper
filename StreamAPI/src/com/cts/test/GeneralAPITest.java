package com.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GeneralAPITest {
	static GeneralAPI api=null;
	
	//@Before//it will execute before every test case
	@BeforeClass
	public static void start()
	{
		api=new GeneralAPI();
		System.out.println("General API object created");
	}

	@Test
	public void testAddNumbers() {
		//fail("Not yet implemented");
		assertEquals(12, api.add(4,8));
	}
	//@After//this test case will be run after every test case
	@AfterClass
	public static void destroy()
	{
		api=null;
		System.out.println("API Object Destroyed");
	}
	@Ignore
	@Test
	public void testCheckForEven() {
		assertEquals(true, api.checkEven(12));
	}
	@Test
	public void testFactorialNumber() {
		assertEquals(120, api.getFactorial(5));
	}
	@Test
	public void testPrimeNumber() {
		assertEquals(true, api.getPrime(2));
	}

}
