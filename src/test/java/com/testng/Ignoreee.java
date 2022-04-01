package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoreee {

	@Test(priority = -1, enabled = false)
	private void eurofighterTyphoon() {
		System.out.println("eurofighterTyphoon");
	}
	
	@Test
	private void nissanGtr() {
		System.out.println("nissanGtr");
	}
	
	@Test(priority = 1)
	private void porscheCarreraGt() {
		System.out.println("porscheCarreraGt");
	}
	
	@Test(priority = 4)
	private void mazdaMiata() {
		System.out.println("mazdaMiata");
	}
	
	@Ignore
	@Test(priority = 2)
	private void toyotaCorolla() {
		System.out.println("toyotaCorolla");
	}
}
