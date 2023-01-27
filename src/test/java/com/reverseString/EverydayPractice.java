package com.reverseString;

public class EverydayPractice {

	public static void main(String[] args) {


		String st ="Selenium";
		
		int len=st.length();
		
		String rev="";
		
		for (int i = len-1; i >=0; i--) {
			rev=rev+st.charAt(i);	
			
		}
		
		System.out.println(rev);
		
		
		int ent=123456;
		
		int riv=0;
		
		while (ent!=0) {
			
			riv=riv*10+ent%10;
			ent=ent/10;
			
		}
		System.out.println(riv);
		
		
		
		

	}

}
