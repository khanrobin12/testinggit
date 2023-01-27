package com.anisul_islam;

import java.util.Scanner;

public class ControlStatement {
	
	/*
	 * it allow us to take the decision when to execute and what to be done to be
	 * execute.
	 */

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		
		if (num>0 ) {
			System.out.println("This is positive");
			
		}else if (num==0){
			System.out.println("this is  a positive or  nagitive number");
		}else {
			System.out.println("This is Nagitive");
			System.out.println("Testing first commit in local to github");
			System.out.println("Testing from gitbash");
		}
		

	}

}
