package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeTest
	private void BrowserLaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");
	}

	@BeforeClass
	private void getUrl() {
		System.out.println("URL");
	}

	@Test
	private void women() {
		System.out.println("Women");
	}

	@BeforeMethod
	private void signin() {
		System.out.println("Signin");
	}

	@AfterMethod
	private void signout() {
		System.out.println("Signout");
	}

	@Test
	private void children() {
		System.out.println("Childern");
	}

	@AfterClass
	private void homePage() {
		System.out.println("Home Page");
	}

	@AfterTest
	private void close() {
		System.out.println("Close");
	}

	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}
}
