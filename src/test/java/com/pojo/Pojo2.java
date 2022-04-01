package com.pojo;

public class Pojo2 {
	public static void main(String[] args) {
		Pojo1 parent = new Pojo1();

		System.out.println(parent.getAge());

		int defineAge = parent.setAge(12);

		System.out.println(defineAge);

		int defineAge2 = parent.setAge(22);

		System.out.println(defineAge2);			
	}
}

