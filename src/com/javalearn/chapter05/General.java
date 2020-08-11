package com.javalearn.chapter05;

public class General {
	public static void main(String[] args) {
		 String str = String.format("%d", 400/2);
		 String str2 = String.format("%b", 3 > 5);
		 String str3 = String.format("%x", 200);
		 
		 System.out.println("the half of 400 is: " + str);
		 System.out.println("the result of 3 > 5 is: " + str2);
		 System.out.println("200 in 16 is: " + str3);
	}

}
