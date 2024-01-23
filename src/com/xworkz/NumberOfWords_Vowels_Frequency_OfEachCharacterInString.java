package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWords_Vowels_Frequency_OfEachCharacterInString {

	public static void main(String[] args) {
		
		String str = "Learning Java Is Easy";
		String[] split = str.split(" ");
		char[] cs = str.toCharArray();
		
		for(int i = 0; i <split.length; i++) {
			System.out.println(split[i] + " :word length is " + split[i].length());
		}
		
		int count  = 0;
		int upperCase = 0;
		for(int i = 0; i <cs.length;i++) {
			if(cs[i] == 'a' || cs[i] == 'e' || cs[i] == 'i' || cs[i] == 'o' || cs[i] == 'u' 
			|| cs[i] == 'A' || cs[i] == 'E' || cs[i] == 'I' || cs[i] == 'O' || cs[i] == 'U') {
				count ++;
			}
			if(cs[i] >= 65 && cs[i] <= 90) {
				upperCase++;
			}
		}
		System.out.println("Vowel count is " + count);
		System.out.println("Uppercase count is " + upperCase);
		
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(char c : cs) {
			if(!map.containsKey(c)) {
			map.put(c, 1);
		  }
			else {
				int i = map.get(c);
				map.put(c, i+1);
			}
		}
		System.out.println(map);
	}
}
