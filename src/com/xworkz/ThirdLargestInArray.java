package com.xworkz;

public class ThirdLargestInArray {
	
	public static void main(String[] args) {
	
		int[] num = {2,6,9,7,8,3,4};
		int first = num[0];
		int second = num[1];
		int third = num[2];
		
		for(int i = 0; i <num.length; i++) {
			if(first < num[i]) {
				third = second;
                second = first;
                first = num[i];
				}
			else if(second < num[i]) {
				third = second;
                second = num[i];
			}
			else if (third < num[i]){
				third = num[i];
			}
		}
		System.out.println(first + " " + second + " " + third);
    }	
}