package com.xworkz;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		
		String string = reverseString("Java");
		System.out.println(string);
	}
	
	public static String reverseString(String s) {
		if(s.isEmpty() || s.length() == 1) {
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);
	}
	
}
