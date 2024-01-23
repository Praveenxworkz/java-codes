package com.xworkz;

import java.util.Arrays;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		
		int[] num = {2,3,4,5,7};
		int sum = 0;
		for(int i = 0; i<num.length;i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
		
		int sum2 = Arrays.stream(num).sum();
		System.out.println(sum2);
	}
	
}
