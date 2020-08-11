package com.javalearn.chapter05;

public class Blak {
	public static void main(String[] args) {
		String str = "     Java     class    ";
		
		System.out.println("the size of the original string is: " 
		+ str.length());
		
		System.out.println("the size of no space is: " 
		+ str.trim().length());
		
	}
// the head and the end space not include the middle space
}
