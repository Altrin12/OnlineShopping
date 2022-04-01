package com.testng;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(priority = 1)
	private void m4() {
		System.out.println("m4");
	}

	@Test(priority = -1, invocationCount = 3)
	private void golfGt() {
		System.out.println("golfGt");
	}

	@Test
	private void rx8() {
		System.out.println("rx8");
	}
}
