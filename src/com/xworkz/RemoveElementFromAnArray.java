package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class RemoveElementFromAnArray {

	public static void main(String[] args) {
		
		int[] originalArray = {1,2,3,4,5};
		int delete = 5;
		
		for(int i = 0;i< originalArray.length;i++) {
			if(originalArray[i] == delete) {
				continue;
			}
			System.out.println(originalArray[i]);
		}
		
	}
}
