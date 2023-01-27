package com.anisul_islam;

import java.util.Scanner;

/*Switch statement is the alternative of large serize of if else condition
*/
public class ControlStatementSwitch {

	public static void main(String[] args) {
		
		int dig;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any digit 0-9");
		
		dig=sc.nextInt();
		
		switch (dig) {
		case 0:
			System.out.println("Zero");
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
			default:
				System.out.println("This is not a digit");

		
		}
		
	}

}
