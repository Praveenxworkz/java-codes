package com.xworkz;

public class FactorsOfNumber {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Factors of a number " + i + " are ");
			for(int j = 1; j <= i; j++) {
			if(i % j == 0) {
				System.out.println(" " + j);
			   }
		    }
		}
		
	}	
}
