package com.operator;

public class ArithmeticOperator {
	//Symbols that are used to perform operations. Arithmetic operator (+,-,*,/,%)
	
	public static void main(String[] args) {
		
		int num1, num2, result;
		
		num1=45;
		num2=10;
		
		result =num1+num2;
		System.out.println("Addition  "+result);
		
		result =num1-num2;
		System.out.println("Subtraction  "+result);
		
		result =num1*num2;
		System.out.println("Multipication  "+result);
		
		result =num1/num2;
		System.out.println("Divition  "+result);
		
		result =num1%num2;
		System.out.println("Remainder  "+result);

	}

}
