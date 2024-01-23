package com.xworkz;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberInArray {

	public static void main(String[] args) {
	
	int[] num = {2,4,1,5,7,8,0};
	
	Set<Integer> set = new HashSet<Integer>();
	for(int no : num) {
		set.add(no);
	}
	
	for(int i = 0; i < num.length+1;i++) {
		if(!set.contains(i)) {
			System.out.println(i);
		  }
	  }
			
	}
}