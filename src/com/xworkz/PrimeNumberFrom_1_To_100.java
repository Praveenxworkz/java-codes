package com.xworkz;

public class PrimeNumberFrom_1_To_100 {

	public static void main(String[] args) {
		 
		int count = 0;
		
		for(int i = 2; i < 100; i++) {
			for(int j = 2; j < i; j++) {
			if(i % j == 0) {
				count ++;
			   }
			}
			if(count == 0) {
				System.out.print(i + " ");
			}
			else {
				count = 0;
			}
		}
		
	}	
}
