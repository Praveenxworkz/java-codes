package com.xworkz;

import java.util.HashSet;
import java.util.Set;

public class CommonBetweenTwoArrays {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,4};
		int[] a2 = {5,4,7,8};
		
		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a2.length; j++) {
				if(a1[i] == a2[j]) {
					System.out.println(a1[i]);
				}
			}
		}
		
		System.out.println("-----another way------");
		
		Set set = new HashSet();
		for(int b1 : a1) {
			set.add(b1);
		}
		for(int b2 : a2) {
			if(set.contains(b2)) {
				System.out.println(b2);
			}
		}
		
	}
	
}
