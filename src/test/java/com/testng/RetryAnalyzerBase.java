package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerBase {

	@Test(retryAnalyzer = RetryAnalyzerRunner.class)
	private void username() {
		String expectedUserName = "Altrin";
		String actualUserName = "ALTRIN";
		Assert.assertEquals(actualUserName, expectedUserName);
	}

	@Test(retryAnalyzer = RetryAnalyzerRunner.class)
	private void password() {
		String expectedpassword = "Altrin";
		String actualpassword = "Altrin123";
		Assert.assertEquals(actualpassword, expectedpassword);
	}





}
