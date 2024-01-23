package com.xworkz;

public class CountNumberOfWordsInSentence {

	public static void main(String[] args) {
		
		String str = "Welcome to Java";
		String[] split = str.split(" ");
		
		for(int i = 0; i<split.length;i++) {
			System.out.println(split[i] + " length is " + split[i].length());
		}
		
	}
}
