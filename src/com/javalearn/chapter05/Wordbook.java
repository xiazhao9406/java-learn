package com.javalearn.chapter05;

public class Wordbook {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "aba";
		String str3 = "abd";
		
		int b1 = str1.compareTo(str2);
		int b2 = str1.compareTo(str3);
		
		System.out.println("the result of str1 and str2 is: "
				+ b1);
		System.out.println("the result of str1 and str3 is: "
				+ b2);
		
	}
// compare the fist different char
}
