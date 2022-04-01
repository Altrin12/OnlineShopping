package com.testng;

import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	private void userName() {
		System.out.println("userName");
	}
	
	@Test
	private void password() {
		System.out.println("password");
	}
}
