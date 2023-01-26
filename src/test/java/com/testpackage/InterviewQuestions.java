package com.testpackage;

import java.util.Scanner;

public class InterviewQuestions {

	public static void main(String[] args) {
		// to print an integer enter by user.

		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Please enter a number"); int a =sc.nextInt();
		 * System.out.println(a);
		 */

		// to add two numbers
		/*
		 * int a,b; Scanner ab=new Scanner(System.in); Scanner ac=new
		 * Scanner(System.in); System.out.println("Please enter two integer number");
		 * a=ab.nextInt(); b=ac.nextInt();
		 * 
		 * System.out.println(a+b);
		 */

		// multiply two floating point numbers

		/*
		 * float a, b; Scanner ab = new Scanner(System.in); Scanner ac = new
		 * Scanner(System.in); 
		 * System.out.println("Please enter two float number");
		 * 
		 * a=ab.nextFloat(); b=ac.nextFloat();
		 * 
		 * System.out.println(a*b);
		 */
		
		// find ascii value of a character
		
		/*
		 * int askey='H'; System.out.println(askey);
		 */
		
		//compute quotient and remainder 
		/*
		 * int a,b; a=65; b=10; int quotient=a/b; int reminder=a%b;
		 * 
		 * System.out.println("Quotient           "+quotient);
		 * System.out.println("Reminder           "+reminder);
		 */
	
		
		
		
		//swap tow number 
		
		/*
		 * int a,b,t; a=10; b=20; System.out.println("Before Swap"+a);
		 * System.out.println("Before Swap"+b); t=a; System.out.println(t); a=b;
		 * System.out.println(a); b=t; System.out.println(b);
		 * 
		 * a=a-b; b=a+b; a=b-a; System.out.println(a+"   "+b);
		 */
		
		//check whether a number is even or odd. 
		/*
		 * int a=50; if (a%2==0) { System.out.println("Even");
		 * 
		 * }else { System.out.println("odd"); }
		 */
		//check whether an alphabet is vowel or consonant. 
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Please enter a Charachater"); char a=sc.next().charAt(0);
		 * System.out.println(a);
		 * 
		 * if (a=='a'||a=='e'||a=='i'||a=='0'||a=='u') { System.out.println("Vowel");
		 * 
		 * }else { System.out.println("Consonant"); }
		 */
		//find the largest amount three numbers
		int x=100;
		int y=600;
		int z=300;
		
		if (x>y && x>z) {
			System.out.println("X grater");
			
		}else if (y>z) {
			System.out.println("Y grater");
		}else {
			System.out.println("Z grater");
		}
		
		// find teh roots of a quadratic equation. 

	}

}
