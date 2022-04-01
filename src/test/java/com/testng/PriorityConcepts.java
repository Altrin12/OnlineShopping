package com.testng;

import org.testng.annotations.Test;

public class PriorityConcepts {
	
	@Test (priority = 2)
	private void sportsCar() {
		System.out.println("sportsCar");
	}
	
	@Test (priority = 0)
	private void motorCycle() {
		System.out.println("motorCycle");
	}
	
	@Test (priority = -2)
	private void bycycle() {
		System.out.println("bycycle");
	}
	
	@Test(priority = 1)
	private void car() {
		System.out.println("car");
	}
	

	
	
	
	
	
}
