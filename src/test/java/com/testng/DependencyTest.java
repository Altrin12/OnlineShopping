package com.testng;

import org.testng.annotations.Test;

public class DependencyTest {

	@Test(priority = 1)
	private void ChinaCountry() {
		System.out.println("China");
	}
	
	@Test
	private void IndiaCountry() {
		System.out.println("IndiaCountry");
	}
	
	@Test(dependsOnMethods = "IndiaCountry")
	private void MaldivesIsland() {
		System.out.println("MaldivesIsland");
	}
}
