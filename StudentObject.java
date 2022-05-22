package com.day3Java;

public class StudentObject {

	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("roll: "+roll);
		System.out.println("name: "+name);
		System.out.println("marks: "+marks+"\n");
		
	}
	public static void main(String[] args) {
		StudentObject s1 = new StudentObject();
		StudentObject s2 = new StudentObject();
		s1.roll = 158;
		s1.marks = 380;
		s1.name = "Mohit Kumar";
		s1.displayStudentDetails();
		s1 = null;
		
		s2.roll = 90;
		s2.marks = 410;
		s2.name = "Rajan Mishra";
		s2.displayStudentDetails();
		s2 = null;
	}

}
