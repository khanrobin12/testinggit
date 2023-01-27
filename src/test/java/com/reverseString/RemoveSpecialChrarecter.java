package com.reverseString;
// Regular expression
public class RemoveSpecialChrarecter {

	public static void main(String[] args) {
		String a ="+_ali &*^&n$#%^&noor#@$%^^&123&*^* ";
		
		a=a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);

	}

}
