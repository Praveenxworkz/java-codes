package com.xworkz;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str = "nitini";
		String sp = "";
		for(int i = str.length()-1; i >= 0;i--) {
			 sp = sp + str.charAt(i);
		}
		
		if(sp.equals(str)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}
}
