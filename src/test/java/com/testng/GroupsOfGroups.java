package com.testng;

import org.testng.annotations.Test;

public class GroupsOfGroups {

	@Test(priority = -1, groups = "Aircraft")
	private void eurofighterTyphoon() {
		System.out.println("eurofighterTyphoon");
	}
	
	@Test (groups = "SportsCars")
	private void nissanGtr() {
		System.out.println("nissanGtr");
	}
	
	@Test (groups = "SportsCars")
	private void porscheCarreraGt() {
		System.out.println("porscheCarreraGt");
	}
	
	@Test(priority = 3, groups = "Cars")
	private void mazdaMiata() {
		System.out.println("mazdaMiata");
	}
	
	@Test(priority = 2, groups = "Cars")
	private void toyotaCorolla() {
		System.out.println("toyotaCorolla");
	}
}
