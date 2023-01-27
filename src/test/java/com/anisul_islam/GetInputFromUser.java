package com.anisul_islam;

import java.util.Scanner;

/*Scanner class will help us to get the input from user. we have to pass the parameter System.in*/

public class GetInputFromUser {

	public static void main(String[] args) {

		int nub1;
		String st;
		char ch;
		byte by;
		short sh;
		long lo;
		float fl;
		double dou;
		boolean bool;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.println("Enter any integer number"); nub1=sc.nextInt();
		 * System.out.println(nub1);
		 */
		
		/*
		 * System.out.println("Enter any String"); st=sc.nextLine();
		 * System.out.println(st);
		 */
		
		/*
		 * System.out.println("Enter any charectar"); ch=sc.next().charAt(0);
		 * System.out.println(ch);
		 */
		
		/*
		 * System.out.println("Enter any byte number"); by=sc.nextByte();
		 * System.out.println(by);
		 */
		
		/*
		 System.out.println("Enter any short number");
		 sh=sc.nextShort();
		 System.out.println(sh);
		*/
		
		/*
		 * System.out.println("Enter any float number"); fl=sc.nextFloat();
		 * System.out.println(fl);
		 */
		
		/*
		 * System.out.println("Enter any double number"); dou=sc.nextDouble();
		 * System.out.println(dou);
		 */
		
		System.out.println("Enter any boolean");
		bool=sc.nextBoolean();
		System.out.println(bool);
		
		
		
		

	}

}
