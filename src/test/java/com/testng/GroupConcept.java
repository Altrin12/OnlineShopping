package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GroupConcept {

	@Test(priority = -1, enabled = true, groups = "Aircraft")
	private void eurofighterTyphoon() {
		System.out.println("eurofighterTyphoon");
	}
	
	@Test (groups = "SportsCars")
	private void nissanGtr() {
		System.out.println("nissanGtr");
	}
	
	@Test(priority = 1, groups = "SportCars")
	private void porscheCarreraGt() {
		System.out.println("porscheCarreraGt");
	}
	
	@Test(priority = 4, groups = "Cars")
	private void mazdaMiata() {
		System.out.println("mazdaMiata");
	}
	
	@Ignore
	@Test(priority = 2, groups = "Cars")
	private void toyotaCorolla() {
		System.out.println("toyotaCorolla");
	}
}
