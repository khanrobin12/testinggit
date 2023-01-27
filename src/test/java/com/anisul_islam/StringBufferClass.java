package com.anisul_islam;

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer st=new StringBuffer("Selenium");
		System.out.println(st.reverse());
		
		int a =123456;
		StringBuffer bu=new StringBuffer(String.valueOf(a));
		System.out.println(bu.reverse());
		

	}

}
