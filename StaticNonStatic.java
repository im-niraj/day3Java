package com.day3Java;

public class StaticNonStatic {
	static int a = 10;  //static variable
	int b = 20;		// non static variable
	
	public static void main(String[] args) {
		System.out.println("Value of a : "+a);

		// accessing non static variable using instance of a class
		// Instance created inorder to access a non static variable.
		StaticNonStatic nonb = new StaticNonStatic();  
		System.out.println("Value of b : "+nonb.b);
	}

}
