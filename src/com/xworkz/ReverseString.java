package com.xworkz;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "praveen";
		 char[] cs = str.toCharArray();
		 for(int i = cs.length-1; i >=0; i--) {
			 System.out.print(cs[i]);
		 }
		 
		 System.out.println();
		 System.out.println("------another way-------");
		 
		 StringBuilder sb = new StringBuilder(str);
		 sb.reverse();
		 System.out.println(sb);
	}
}
