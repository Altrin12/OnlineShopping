package com.automation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationbase.Base_Class;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pageobjectmanager.PageObjectManager;

public class RunnerClass_TestNG extends Base_Class {

	public static WebDriver driver = browserConfiguration("Chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = Logger.getLogger(RunnerClass_TestNG.class);
	
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter sparkReporter;
	
		@BeforeTest
		private void reportGeneration() {
			sparkReporter = new ExtentSparkReporter("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Reports\\Automation_TestNG_Report.html");
			reports = new ExtentReports();
			reports.attachReporter(sparkReporter);
		}
	
		@AfterTest
		private void flush() {
			reports.flush();
		}
	
		@Test(priority = 1)
		private void urlLaunchDetails()throws Throwable {
			PropertyConfigurator.configure("log4j.properties");
			getUrl("http://automationpractice.com/index.php");
			log.info("Url Launch");
			deleteAllCookies();
		}
		
		@Test(priority = 2)
		private void homePageDetails()throws Throwable {
			implicitwait(10, TimeUnit.SECONDS);
			clickOnElement(pom.getHP().getLogin());
		}
	
		@Test(priority = 3)
		private void loginPageDetails()throws Throwable {
		driver.findElement(By.name("email_create")).sendKeys("altrin140@gmail.com");
		//inputValueElement(pom.getLP().getEmaill(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",2,5));
		clickOnElement(pom.getLP().getSignin());
		}
		
		@Test(priority = 4)
		private void personalInformationDetails()throws Throwable {
		implicitwait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getPI().getIdgen());		
		inputValueElement(pom.getPI().getFirstname(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",5,5));
		inputValueElement(pom.getPI().getLastname(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",6,5));
		clickOnElement(pom.getPI().getEmail());
		inputValueElement(pom.getPI().getPasswordd(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",8,5));
		clickOnElement(pom.getPI().getDays());
		clickOnElement(pom.getPI().getMonths());
		clickOnElement(pom.getPI().getYears());
		clickOnElement(pom.getPI().getNewsletter());
		clickOnElement(pom.getPI().getOptions());
		clickOnElement(pom.getPI().getFrstnme());
		clickOnElement(pom.getPI().getLstnme());
		inputValueElement(pom.getPI().getApple(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",15,5));
		inputValueElement(pom.getPI().getAddress1(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",16,5));
		inputValueElement(pom.getPI().getAddress2(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",17,5));
		inputValueElement(pom.getPI().getCity(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",18,5));
		clickOnElement(pom.getPI().getIdstate());
		inputValueElement(pom.getPI().getPostcode(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",12,5));
		inputValueElement(pom.getPI().getOther(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",20,5));
		inputValueElement(pom.getPI().getPhone(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",21,5));
		inputValueElement(pom.getPI().getMobile(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",22,5));
		clearElement(pom.getPI().getAli());
		inputValueElement(pom.getPI().getAlias(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",13,5));		
		clickOnElement(pom.getPI().getSubmitaccount());
		}

		@Test(priority = 5)
		private void cotegoryPageDetails()throws Throwable {
		clickOnElement(pom.getCP().getTopmenu1());
		}

		@Test(priority = 6)
		private void productPageDetails()throws Throwable {
		clickOnElement(pom.getPP().getTopmenu2());		
		clickOnElement(pom.getPP().getCenter());
		clickOnElement(pom.getPP().getTshirt());
		clickOnElement(pom.getPP().getIcon1());
		clickOnElement(pom.getPP().getIcon2());
		clickOnElement(pom.getPP().getButton());
		clickOnElement(pom.getPP().getCheckout());
		}

		@Test(priority = 7)
		private void orderPageDetails()throws Throwable {
		clickOnElement(pom.getOP().getColumn());
		clickOnElement(pom.getOP().getCheck22());
		clickOnElement(pom.getOP().getCgv());
		clickOnElement(pom.getOP().getCheckout());
		}
		
		@Test(priority = 9)
		private void paymentPageDetails()throws Throwable {
		clickOnElement(pom.getPMP().getPayment());		
		}
		
		@Test(priority = 10)
		private void configurationPageDetails()throws Throwable {
		clickOnElement(pom.getCMP().getNavigate());
		log.info("Product booked successfully");
		close();
		}
}