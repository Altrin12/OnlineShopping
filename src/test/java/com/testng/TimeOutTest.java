package com.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

	@Test(timeOut = 9000)
	private void browserExecution() throws Throwable {
		
		Thread.sleep(2000);
		System.out.println("browserExecution");
		
		Thread.sleep(2000);
		System.out.println("urlLaunch");
		
		Thread.sleep(2000);
		System.out.println("credentials");
		
		Thread.sleep(2000);
		System.out.println("nextPage");	
	}
}
