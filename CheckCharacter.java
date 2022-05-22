package com.day3Java;

public class CheckCharacter {
	
	String checkChar(char ch) {
		boolean isVowel = false;
		
		switch(ch){
			case 'a' : isVowel = true;
				break;
			case 'e' :	isVowel = true;
				break;
			case 'i' :	isVowel = true;
				break;
			case 'o' :	isVowel = true;
				break;
			case 'u' :	isVowel = true;
				break;
			case 'A' :	isVowel = true;
				break;
			case 'E' :	isVowel = true;
				break;
			case 'I' :	isVowel = true;
				break;
			case 'O' :	isVowel = true;
				break;
			case 'U' :	isVowel = true;
				break;
		}
		
		if(isVowel) {
			return "Vowel";
		}
		else {
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				return "Consonant";
			}
			else {				
				return "Input is not an alphabet";
			}
		}
		
	};
	public static void main(String[] args) {
		CheckCharacter checkFun = new CheckCharacter();
		String x1 = checkFun.checkChar('a');
		String x2 = checkFun.checkChar('b');
		String x3 = checkFun.checkChar('9');
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}

}
