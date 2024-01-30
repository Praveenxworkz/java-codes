package com.xworkz;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] a = {1 ,2 ,3 ,4 ,5};
		int[] copy = new int[a.length];
		
		for(int i = 0; i < a.length; i++ ) {
			copy[i] = a[i];
		}
		
		for(int i = 0; i <copy.length; i++) {
			System.out.print(copy[i]);
		}		
	}
}
