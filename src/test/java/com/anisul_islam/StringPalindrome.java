package com.anisul_islam;

//after reversing a string if reverse string and string are still same then it call Palindrome.

public class StringPalindrome {

	public static void main(String[] args) {

			
		String palindrome="madam";
		StringBuffer bu=new StringBuffer(palindrome);
		String palindrome2=bu.reverse().toString();
		
		if (palindrome.equalsIgnoreCase(palindrome2)) {
			System.out.println("palindrome");
			
		}
		

	}

}
