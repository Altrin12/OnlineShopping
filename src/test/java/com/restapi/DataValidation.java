package com.restapi;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataValidation {

	@Test
	public void dataValidation() {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users/2");
		System.out.println(response.asString());
		
		int actualCode = response.getStatusCode();
		Assert.assertEquals(200, actualCode);
		System.out.println("Data Validated");	
	}
}
