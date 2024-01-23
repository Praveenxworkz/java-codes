package com.xworkz;

public class ReverseWordString {

	public static void main(String[] args) {
		
		String word = "Welcome to Java world";
		String[] split = word.split(" ");
		for(int i = split.length-1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
		
	}
}
