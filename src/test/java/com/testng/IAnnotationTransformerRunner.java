package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IAnnotationTransformerRunner {

	@Test(priority = -1)
	private void username() {
		String actualUserName = "Altrin";
		String expectedUserName = "ALTRIN";
		Assert.assertEquals(actualUserName, expectedUserName);
	}
	
	@Test
	private void password() {
		String actualpassword = "Altrin123";
		String expectedpassword = "Altrin123";
		Assert.assertEquals(actualpassword, expectedpassword);
	}
	
	
	
	
	
	
}
