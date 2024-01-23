package com.xworkz;

public class EvenLengthWordInString {

	public static void main(String[] args) {
		
		String str = "Hell world";
		String[] split = str.split(" ");
		
		for(int i = 0; i <split.length;i++) {
			if(split[i].length() % 2 == 0) {
				System.out.println(split[i] + " : length is even" );
			}
		}
		
	}
	
}
