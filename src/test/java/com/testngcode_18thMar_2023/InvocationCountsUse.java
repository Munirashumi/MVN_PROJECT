package com.testngcode_18thMar_2023;

import org.testng.annotations.Test;

public class InvocationCountsUse {

	@Test(priority=1)
	public void sample1() {
		System.out.println("This is test1");
	}
	
	@Test(priority=2)
	public void sample2() {
		System.out.println("This is test2");
		
	}
	
	@Test(priority=3, invocationCount = 5)
	public void sample3() {
		System.out.println("This is test3 ");
	}
}


