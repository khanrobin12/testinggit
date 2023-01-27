package com.javaloop;

import java.util.Iterator;

/*Loop allows us execute a statement or group of statement multiple times. loop has 3 parts initialization, condition and increment and decrement*/
public class JavaForLoop {

	public static void main(String[] args) {
		
		System.out.println("Print Bangladesh 10x");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+"      Bangladesh");
		}
		
		System.out.println("Print bangladesh with even number");
		
		for (int j = 2; j <= 10; j=j+2) {
			System.out.println(j+"      Bangladesh");
		}
		
		
		System.out.println("Print bangladesh with odd number");
		
		for (int k = 1; k <= 10; k=k+2) {
			System.out.println(k+"      Bangladesh");
		}
		

		System.out.println("Pring bangladesh with decress number");
		
		for (int l = 10; l >=1; l--) {
			System.out.println(l+"      Bangladesh");
		}
		
		
	}

}
