package com.anisul_islam;
//https://docs.oracle.com/javase/8/docs/api/index-files/index-1.html
public class MathClass {

	public static void main(String[] args) {

			int a=20;
			int b=40;
			int c=Math.max(a, b);
			System.out.println(c);
			
			int d=Math.min(a, b);
			System.out.println(d);
			
			int e=Math.subtractExact(a, b);
			System.out.println(e);
			
			int f=Math.ceilDiv(a, b);
			System.out.println(f);
			
			int g=Math.addExact(a, b);
			System.out.println(g);
			

	}

}
