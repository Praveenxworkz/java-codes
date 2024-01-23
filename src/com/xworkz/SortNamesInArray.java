package com.xworkz;

import java.util.Arrays;

public class SortNamesInArray {

	public static void main(String[] args) {
		
		String[] str = {"Banana","Grapes","biscuit","Apple","orange","anjur"};
		Arrays.sort(str);
		for(String s : str) {
		System.out.println(s);
		}
		
	}
}