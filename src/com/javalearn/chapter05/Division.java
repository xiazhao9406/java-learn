package com.javalearn.chapter05;

public class Division {
	public static void main(String[] args) {
		String str = "192.168.0.1";
		String[] firstArray = str.split("\\.");
		String[] secondArray = str.split("\\.", 2);
		System.out.println("the original string is: [" + str + "]");
		System.out.print("all spilt array is: " );
		for (String a:firstArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();
		
		System.out.print("spilt 2 times is: ");
		for (String a: secondArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();
		
	}
	
	
	

}
