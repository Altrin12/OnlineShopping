package com.automation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationbase.Base_Class;
import com.pageobjectmanager.PageObjectManager;
import com.singeltondesignpattern.FileReaderManager;

public class RunnerClass_SDP extends Base_Class{

	public static WebDriver driver = browserConfiguration("Chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);

	public static Logger log = Logger.getLogger(RunnerClass_SDP.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
		getUrl(FileReaderManager.getInstanceFRM().getInstancCR().getConfigUrl());
		log.info("Url Launch");

		implicitwait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getHP().getLogin());
		deleteAllCookies();
		
		driver.findElement(By.name("email_create")).sendKeys("altrin137@gmail.com");
		//inputValueElement(pom.getLP().getEmaill(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigEmail()));
		clickOnElement(pom.getLP().getSignin());

		implicitwait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getPI().getIdgen());		
		inputValueElement(pom.getPI().getFirstname(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigFirstName()));
		inputValueElement(pom.getPI().getLastname(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigLastName()));
		clickOnElement(pom.getPI().getEmail());
		inputValueElement(pom.getPI().getPasswordd(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigPassword()));
		clickOnElement(pom.getPI().getDays());
		clickOnElement(pom.getPI().getMonths());
		clickOnElement(pom.getPI().getYears());
		clickOnElement(pom.getPI().getNewsletter());
		clickOnElement(pom.getPI().getOptions());
		clickOnElement(pom.getPI().getFrstnme());
		clickOnElement(pom.getPI().getLstnme());
		inputValueElement(pom.getPI().getApple(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigCompany()));
		inputValueElement(pom.getPI().getAddress1(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigAddress1()));
		inputValueElement(pom.getPI().getAddress2(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigAddress2()));
		inputValueElement(pom.getPI().getCity(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigCity()));
		clickOnElement(pom.getPI().getIdstate());
		inputValueElement(pom.getPI().getPostcode(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigPostCode()));
		inputValueElement(pom.getPI().getOther(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigOther()));
		inputValueElement(pom.getPI().getPhone(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigPhone()));
		inputValueElement(pom.getPI().getMobile(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigMobile()));
		clearElement(pom.getPI().getAli());
		inputValueElement(pom.getPI().getAlias(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigAlias()));		
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
