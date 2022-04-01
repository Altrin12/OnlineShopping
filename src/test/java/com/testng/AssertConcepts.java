package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConcepts {
	
	//AssertEquals
	@Test
	private void userName() {
		String expectedUserName = "Altrin";
		String actualUserName = "ALTRIN";
		Assert.assertEquals(actualUserName, expectedUserName);
		System.out.println("Assert Validation");
	}
	
	//AssertNotEquals
	@Test
	private void userName2() {
		String expectedUserName = "Altrin Mohan";
		String actualUserName = "ALTRIN MOHAN";
		Assert.assertNotEquals(actualUserName, expectedUserName);
		System.out.println("Assert Validation");
	}

	//SoftAssert
	@Test
	private void userName3() {
		String expectedUserName = "Altrin Mohan";
		String actualUserName = "ALTRIN MOHAN";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(expectedUserName, actualUserName);
		System.out.println("Assert Validation");
	}









}

