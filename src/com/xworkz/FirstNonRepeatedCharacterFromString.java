package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterFromString {

	public static void main(String[] args) {
		
		String str = "praveen";
		char[] cs = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(char c : cs) {
		if(!map.containsKey(c)) {
			map.put(c,1);
		}
		else {
			int integer = map.get(c);
			map.put(c, integer + 1);
		}
		if(map.get(c) == 1) {
			System.out.println("First non repeated character is " + c);
			break;
		  }
		else {
			System.out.println("No character is repeated");
		  }
		}
		
	}
}
