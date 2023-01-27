package com.anisul_islam;

import java.util.Calendar;

/*help us to output data in a formatted fashion to out desires.
 
Nathan Schutz
 */

public class FormatSpecifier {

	public static void main(String[] args) {
			System.out.printf("%d",10); 	//integer
			System.out.printf("%f",10.1);	//double, float
			System.out.printf("%c",'a');	// character 
			System.out.printf("%C",'a');	//character upper
			System.out.printf("%s","hello");	// string
			System.out.printf("%S","hello");	//string upper
			System.out.printf("%b",5<4);	// boolean
			System.out.printf("%B",5<4);	// boolean upper
			//System.out.printf("%b",null);	// false
			System.out.printf("%b","cow");	// true
			System.out.printf("%e",10.123);	//scientific notation
			System.out.printf("%E",10.123);	// scientific notation capitalize E
			System.out.printf("%g",10000.0);	// decimal or scientific format
			System.out.printf("%o",10);	// octal base
			System.out.printf("%x",10);	// hexadecimal
			System.out.printf("%X",10);	// hexadecimal capital A
			System.out.printf("%h","hello");	// hash code
			System.out.printf("%H","hello");	// hash code capital
			System.out.printf("%a",10.12);	// hexadecimal floating point
			System.out.printf("%A",10);	// hexadecimal floating point capital
			
			Calendar cal=Calendar.getInstance();
			System.out.printf("%tB",cal);	//
			System.out.printf("%TB",cal);	//
			
			System.out.printf("%n");	// new line
			System.out.printf("\n");	// new line
			System.out.printf("%%");	//%
			System.out.printf("%d",10);	//
			System.out.printf("%d",10);	//
			System.out.printf("%d",10);	//
			System.out.printf("%d",10);	//
			


	}

}
