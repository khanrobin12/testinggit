package com.operator;

import java.util.Scanner;

/*Conditional Operator are ?,:,   if the condition true will print 1 statement else 2nd statement.*/

public class ConditionalOperator {

	public static void main(String[] args) {
		
		int num1, num2,large;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter two number");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		large=(num1>num2)?num1:num2;
		
		System.out.println(large);

	}

}
