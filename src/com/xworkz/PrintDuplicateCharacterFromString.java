package com.xworkz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacterFromString {

	public static void main(String[] args) {
		
		String str = "praveen pawar";
		char[] cs = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(char c : cs) {
			if(!map.containsKey(c)) {
				map.put(c,1);
			}
			else {
				int i = map.get(c);
				map.put(c, i+1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entry = map.entrySet();
		for(Map.Entry<Character,Integer> m : entry) {
			if(m.getValue() > 1) {
				System.out.println(m.getKey());
			}
		}
		
	}
}