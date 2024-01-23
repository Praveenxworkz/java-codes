package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,1,6,9,3,5,3,6,2,3,3,2,3,2,1,1};
		
		int value = 0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i : num) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}
			else {
			    value = map.get(i);
				map.put(i, value + 1);
			}
		}
		
		int maxKey = 0;
		int maxValue = Integer.MIN_VALUE;
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			if(entry.getValue() > maxValue ) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		System.out.println("key " + maxKey + " has max value: " + maxValue);
		
	}
	
}
