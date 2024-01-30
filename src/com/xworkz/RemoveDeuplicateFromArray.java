package com.xworkz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveDeuplicateFromArray {

public static void main(String[] args) {
		
		int[] a = {1,2,3,5,6,2,3,1,2,3,4,5};
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i : a) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}
			else {
				int b = map.get(i);
				map.put(i, b+1);
			}
		}
		
		Set<Entry<Integer,Integer>> set = map.entrySet();
		for(Entry<Integer, Integer> s : set ) {
			Integer value = s.getValue();
			if(value <= 1) {
				System.out.println(s.getKey());
			}
		}
	}
	
}
