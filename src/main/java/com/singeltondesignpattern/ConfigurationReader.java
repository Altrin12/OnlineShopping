package com.singeltondesignpattern;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws Throwable {
		File f = new File("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\src\\main\\java\\com\\singeltondesignpattern\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getConfigUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getConfigEmail() {
		String email = p.getProperty("email");
		return email;
	}

	public String getConfigFirstName() {
		String firstName = p.getProperty("firstName");
		return firstName;
	}

	public String getConfigLastName() {
		String lastName = p.getProperty("lastName");
		return lastName;
	}

	public String getConfigPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getConfigCompany() {
		String company = p.getProperty("company");
		return company;
	}

	public String getConfigAddress1() {
		String address1 = p.getProperty("address1");
		return address1;
	}

	public String getConfigAddress2() {
		String address2 = p.getProperty("address2");
		return address2;
	}

	public String getConfigCity() {
		String city = p.getProperty("city");
		return city;
	}

	public String getConfigPostCode() {
		String postCode = p.getProperty("postCode");
		return postCode;
	}

	public String getConfigOther() {
		String other = p.getProperty("other");
		return other;
	}

	public String getConfigPhone() {
		String phone = p.getProperty("phone");
		return phone;
	}

	public String getConfigMobile() {
		String mobile = p.getProperty("mobile");
		return mobile;
	}

	public String getConfigAlias() {
		String alias = p.getProperty("alias");
		return alias;
	}
}
