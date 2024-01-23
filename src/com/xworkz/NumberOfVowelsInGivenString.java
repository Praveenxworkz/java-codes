package com.xworkz;

public class NumberOfVowelsInGivenString {

	public static void main(String[] args) {
		
		String str = "praveen";
		char[] cs = str.toCharArray();
		
		int count  = 0;
		for(int i = 0; i <cs.length;i++) {
			if(cs[i] == 'a' || cs[i] == 'e' || cs[i] == 'i' || cs[i] == 'o' || cs[i] == 'u') {
				count ++;
			}
		}
		System.out.println(count);
		
	}
}
