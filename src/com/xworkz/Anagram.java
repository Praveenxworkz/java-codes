package com.xworkz;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "Silent";
		String str2 = "Listen";
		
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("It is not a anagram");
		}
		else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2) == true) {
				System.out.println("They are anagram");
			}
			else {
				System.out.println("They are not");
			}
		}	
	}
	
}
