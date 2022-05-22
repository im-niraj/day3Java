package com.day3Java;

public class CheckWeather {

	public static void main(String[] args) {
		
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.00;
		
		if(isSnowing || isRaining) {
			System.out.println("Let's stay home. raining, snowing");
		}
		else if(temperature < 50.00) {
			System.out.println("Let's stay home.");
		}
		else {
			System.out.println("Let’s go out!");
		}
	}

}
