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
		int a,b;
		Scanner ab=new Scanner(System.in);
		Scanner ac=new Scanner(System.in);
		System.out.println("Please enter two integer number");
		a=ab.nextInt();
		b=ac.nextInt();
		
		System.out.println(a+b);
		
		
	}

}
