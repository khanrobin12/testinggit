package com.operator;

import java.util.Scanner;

public class LogicalOperator {
	
	/* create relationship between two or more condition. Logical Opetator are &&,||,!, */

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
		
		
		char sb;
		
		Scanner inp =new Scanner(System.in);
		System.out.println("Enter any Chareacter");
		
		sb=inp.next().charAt(0);
		
		if (sb>='a' && sb<='z') {
			System.out.println("small");
		}else if(sb>='A' && sb<='Z'){
			System.out.println("Capital");
		}
	}

}
