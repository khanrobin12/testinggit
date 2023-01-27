package com.anisul_islam;

import java.util.Scanner;

public class PrintOddFromMtoN {

	public static void main(String[] args) {
		
		// Print sum of all the numbers from 1 to 10
		/*
		 * int a=0;
		 * 
		 * for (int i = 0; i <= 10; i++) { a=a+i;
		 * 
		 * } System.out.println(a);
		 */
		
		
		//print sum of all the numbers from m to n
		
		/*
		 * int a,b,c=0;
		 * 
		 * System.out.println("Please enter two number");
		 * 
		 * Scanner sc=new Scanner(System.in); Scanner sc1 =new Scanner(System.in);
		 * a=sc.nextInt(); b=sc1.nextInt();
		 * 
		 * 
		 * for (int i = a; i <= b; i++) { c=c+i;
		 * 
		 * } System.out.println(c);
		 */
		
		
		//Print sum of all the even numbers from m to n 
		
		int a,b,c=0;
		  
		  System.out.println("Please enter two number");
		  
		  Scanner sc=new Scanner(System.in); Scanner sc1 =new Scanner(System.in);
		  a=sc.nextInt(); b=sc1.nextInt();
		
		  for (int i = a; i <= b; i++) {
			
			  if (i%2==0) {
				  c=c+i;
				  System.out.print("    "+i);
			  }
			  
		}
		  System.out.println("                "+      c);
	}

}
