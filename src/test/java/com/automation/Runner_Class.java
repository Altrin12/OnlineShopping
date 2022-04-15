package com.automation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automationbase.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver = browserConfiguration("Chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);

	public static Logger log = Logger.getLogger(Runner_Class.class);
	
	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://automationpractice.com/index.php");
		log.info("Url Launch");
		deleteAllCookies();
		
		implicitwait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getHP().getLogin());
		deleteAllCookies();
		
		driver.findElement(By.name("email_create")).sendKeys("altrin18@gmail.com");
		//inputValueElement(pom.getLP().getEmaill(),particularData("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\Test Cases\\Test Case Online Shoping.xlsx",2,5));
		clickOnElement(pom.getLP().getSignin());

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

		clickOnElement(pom.getCP().getTopmenu1());

		clickOnElement(pom.getPP().getTopmenu2());		
		clickOnElement(pom.getPP().getCenter());
		clickOnElement(pom.getPP().getTshirt());
		clickOnElement(pom.getPP().getIcon1());
		clickOnElement(pom.getPP().getIcon2());
		clickOnElement(pom.getPP().getButton());
		clickOnElement(pom.getPP().getCheckout());

		clickOnElement(pom.getOP().getColumn());
		clickOnElement(pom.getOP().getCheck22());
		clickOnElement(pom.getOP().getCgv());
		clickOnElement(pom.getOP().getCheckout());
		
		clickOnElement(pom.getPMP().getPayment());

		clickOnElement(pom.getCMP().getNavigate());
		
		log.info("Product booked successfully");
		
		close();
	}
}
