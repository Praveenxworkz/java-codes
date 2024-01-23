package com.xworkz;

public class PrintNumbersWithoutLoop {

	//using recurssion
	public static void main(String[] args) {
		printNumber(1);
	}
	
	public static void printNumber(int n) {
		if(n <= 10) {
			System.out.print(n + " ");
			printNumber(n+1);
		}
	}
	
}
