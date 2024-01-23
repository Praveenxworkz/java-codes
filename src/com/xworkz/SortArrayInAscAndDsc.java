package com.xworkz;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInAscAndDsc {

	public static void main(String[] args) {
		
		int[] asc = {5,6,9,2,3,4,7};
		Arrays.sort(asc);
		System.out.println(Arrays.toString(asc));
		
		Integer[] dsc = {1,5,9,3,4,8,2};
		Arrays.sort(dsc,Collections.reverseOrder());
		System.out.println(Arrays.toString(dsc));
		
	}
}
