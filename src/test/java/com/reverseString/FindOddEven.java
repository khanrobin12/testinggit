package com.reverseString;

import java.util.Scanner;

/* we have to divide the number by 2 if the module is zero then this is even number. */
public class FindOddEven {

	public static void main(String[] args) {
		
		 int num;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any number");
		
		num=sc.nextInt();
		
		
		if (num%2==0) {
			System.out.println("This tis even number");
		}else{
			System.out.println("This is odd number");
		}

	}

}
