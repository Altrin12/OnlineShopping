package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"userName","passWord"})
	private void credentials(@Optional("ALTRIN") String userName, String passWord) {
		System.out.println(userName);
		System.out.println(passWord);
	}
}
