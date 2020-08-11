package com.javalearn.chapter05;

public class StartOrEnd {
	// 判断字符串的开始与结尾 startsWith() and endsWith(). the result is bool.
	public static void main(String[] args) {
		String str1 = "23455667";
		String str2 = "5445464565";
		
		boolean b1 = str1.startsWith("23");
		boolean b2 = str1.endsWith("66");
		boolean b3 = str2.startsWith("22");
		boolean b4 = str2.endsWith("65");
		
		System.out.println("the result of string 1 is start with 23 is: "
				+ b1);
		System.out.println("the result of string 1 is end with 66 is: "
				+ b2);
		System.out.println("the result of string 2 is start with 22 is: " 
				+ b3);
		System.out.println("the result of string 2 is end with 65 is: "
				+ b4);
		
	}

}
