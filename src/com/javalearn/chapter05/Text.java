package com.javalearn.chapter05;

public class Text {
	public static void main(String[] args) {
		String str = "we are students";
		
		int index = str.lastIndexOf("s");
		System.out.println("s is: " + index);
		// function of lastIndexOf() and length()
		int size = str.lastIndexOf("");
		System.out.println("the size is: " + size);
		
		System.out.println("the size is: " + str.length());
		
		
	}

}
