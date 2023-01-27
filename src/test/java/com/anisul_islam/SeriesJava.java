package com.anisul_islam;

import java.util.Scanner;

public class SeriesJava {

	public static void main(String[] args) {
		// 1+2+3+...n
		/*
		 * int sum=0; Scanner sc=new Scanner(System.in);
		 * System.out.println("Please enter any number"); int a=sc.nextInt();
		 * 
		 * for (int i = 1; i <=a; i++) {
		 * 
		 * sum=sum+i; System.out.print("   "+i); } System.out.println(sum);
		 */
		
		
		
		//1+3+5+....n
		
		
		
		//1.5+2.5+3.5+...n
		
		
		
		
		//1^2+2^2+3^2+4^2+...+n^2
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		int a=sc.nextInt();
		for (int i = 1; i <= a; i++) {
			sum=sum+i*i;
			System.out.print(i+"*"+i+"        ");
		}
		System.out.println(sum);
		
		
		//1*2*3*.....*n
		//1*3*5*.....*n
		//1^2*2^2*3^2*4^2*...*n

	}

}
			