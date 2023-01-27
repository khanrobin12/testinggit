package com.reverseString;

public class ReverseInteger {
	
	// first we have to find the remainder then we have to divide the number 10 will give us one less number from the num variable. 

	public static void main(String[] args) {
		
		
		int num =1234;
		int rev=0;
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		
		int num2 = 98765;
		
		//System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
		
		StringBuffer st=new StringBuffer(String.valueOf(num2));
		System.out.println(st.reverse());

	}

}
