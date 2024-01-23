package com.xworkz;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		
		String str = "praveen";
		char[] cs = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for(char c : cs) {
			set.add(c);
		}
		System.out.println(set);
		
		System.out.println("----------alternate way----------");
		
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i <sb.length();i++) {
			for(int j = i+1; j <sb.length();j++) {
				if(sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb);
	}
}
