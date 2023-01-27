package com.assingment;

import java.util.Scanner;

//Sum of the natural number it means 1+2+3+4 =10


public class AddTenNum {

	public static void main(String[] args) {
		
		int num, i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any Number");
		
		num=sc.nextInt();
		
		
		while (i<=num) {
			
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		
		
		
		int num2, fac=0;
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Please enter any number");
		 num=sc2.nextInt();
		 
		 for (int j = 1; j <= num; j++) {
			 
			 fac=fac+j;
			
		}
			
		
		 
		 System.out.println(fac);
	
		
		
		
	}

}
