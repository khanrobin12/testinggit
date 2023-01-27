package com.anisul_islam;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Find a prime number 
		int count =0;
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		
		for (int i = 2; i < num; i++) {
			
			if (num%i==0) {
				
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not prime");
		}

	}

}
