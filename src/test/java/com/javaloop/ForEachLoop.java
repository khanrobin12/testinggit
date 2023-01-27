package com.javaloop;

//enhanch for loop use to transver or travel accross Arrey. 
public class ForEachLoop {

	public static void main(String[] args) {

		int [] num=new int[7];
		
		num[0]=6;
		num[1]= 5;
		num[2]=4;
		num[3]=3;
		num[4]=2;
		num[5]=1;
		num[6]=0;
		
		for(int x:num) {
			System.out.println(x);
			
			int a=num.length;
			System.out.println(a);
		}
		

	}

}
