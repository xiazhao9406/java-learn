package com.javalearn.chapter05;

public class UpAndLower {
	public static void main(String[] args) {
		String str = new String("abc DEF");
		String newstr = str.toLowerCase();
		String newstr1 = str.toUpperCase();
		
		System.out.println(newstr);
		System.out.println(newstr1);
	}

}