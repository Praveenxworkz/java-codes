package com.xworkz;

public class LargestNumberInArray {

	public static void main(String[] args) {
		
		int[] a = {4,2,3,5,9,7,6};
		
		int largest = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(largest < a[i]) {
				largest = a[i];
			}
		}
		System.out.println(largest);
	}
	
}
