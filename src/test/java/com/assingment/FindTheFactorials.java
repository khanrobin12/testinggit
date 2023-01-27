package com.assingment;

import java.util.Scanner;

public class FindTheFactorials {

	public static void main(String[] args) {
		

		int num, fac=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		 num=sc.nextInt();
		 
		 for (int i = 1; i <= num; i++) {
			 
			 fac=fac*i;
			
		}
			
		
		 
		 System.out.println(fac);
		
		
	}

}
