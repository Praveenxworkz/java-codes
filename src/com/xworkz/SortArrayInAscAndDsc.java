package com.xworkz;

public class SortArrayInAscAndDsc {

	public static void main(String[] args) {
		
		int[] asc = {5,6,9,2,3,4,7};
		int temp = 0;
		
		for(int i = 0; i < asc.length; i++) {
			for(int j = i+1; j < asc.length; j++) {
				if(asc[i] > asc[j]) {
					temp = asc[i];
					asc[i] = asc[j];
					asc[j] = temp;
				}
			}
		}
		for(int i = 0; i <asc.length; i++) {
			System.out.print(asc[i] + " ");
		}
		
		System.out.println();
		System.out.println("====descending order=====");
	
		int[] dsc = {1,2,3,4,5,6,7};
		int num = 0;
		
		for(int i = 0; i < dsc.length; i++) {
			for(int j = i+1; j < dsc.length; j++) {
				if(dsc[i] < dsc[j]) {
					num = dsc[i];
					dsc[i] = dsc[j];
					dsc[j] = num;
				}
			}
		}
		for(int i = 0; i <dsc.length; i++) {
			System.out.print(dsc[i] + " ");
		}
			
	}
}
