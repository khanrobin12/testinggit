package com.reverseString;

import java.util.Scanner;

public class FindVowelConsonant {

	public static void main(String[] args) {
		
		char cha;
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any Chareacter");
		
		cha=input.next().charAt(0);
		
		if (cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
		
	}

}
