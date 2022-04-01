package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderrr {

	@Test(dataProvider = "testData")
	private void credentials(String userName, int passWord) {
		System.out.println(userName);
		System.out.println(passWord);
	}

	@DataProvider
	private Object[][] testData() {

		return new Object[][] {
			{"Altrin",123},
			{"Emma",124},
			{"William",125},
			{"Lara",126}
		};
	}
}
