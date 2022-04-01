package com.testng;

import org.testng.annotations.Test;

public class ExpectedExceptionnn {

	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator() {
		System.out.println(10/0);
		System.out.println("Display output");
	}
}
