package com.testng;

import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority=1)
	public void test1() {
		System.out.println("TestNg 1");
	}
	
	@Test(priority=3)
	public void test2() {
		System.out.println("TestNg 2");
		
	}
	
	@Test(priority=4)
	public void test3() {
		System.out.println("TestNg 3");
	}
	
	@Test(priority=2)
	public void test() {
		System.out.println("TestNg 4");
	}
	
	//TO IGNORE
	@Test(priority=1, enabled=false)
	public void test5() {
		System.out.println("test");
	}
	
	//count
	
	@Test(priority=5,invocationCount=10)
	public void test6() {
		System.out.println("testing count");
	}
	
	//Timeout
	
	@Test(priority=7,timeOut=1000)
	public void test7() {
		System.out.println("testing timeout");
	}
	
	//Assert
	@Test
	public void test8() {
		System.out.println("ABC");
		Assert.assertEquals("ABC", "XYZ");
	}
	
	
	//exception
	@Test
	public void test9() throws Exception {
		System.out.println("Exception");
		throw new Exception();
	}
	
	//Parameter
	
	
	
	
	
	
	
	
	
	
}
