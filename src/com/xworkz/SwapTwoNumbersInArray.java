package com.xworkz;

public class SwapTwoNumbersInArray {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = b;
		b = a;
		a = c;
		System.out.println(a + " " + b);
		
		//without using third variable
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println(a + " " + b);
		
	}
	
}
