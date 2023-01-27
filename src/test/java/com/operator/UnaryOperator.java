package com.operator;

public class UnaryOperator {
	
	/* Unary Operators are +, -, ++x,x++, --x,x-- */

	public static void main(String[] args) {
				
		int x= -10;
		int result;
		
		result=+x; //-10
		System.out.println(result);
		
		result=-x; //-10-10
		System.out.println(result);
		
		System.out.println("******************************");
		
		
		int a=25;
		int b;
		
		b=++a;
		System.out.println(b); //26 it increased before. 
		System.out.println(b);
		
		b=a++;
		System.out.println(b); // it will increase after
		System.out.println(b);
		
		
		System.out.println("*****************");
		
		
		b=--a;
		System.out.println(b); // it will increase after
		System.out.println(b);
		
		b=a--;
		System.out.println(b); // it will increase after
		

	}

}
