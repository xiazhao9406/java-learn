package com.javalearn.charpter03;

public class Part {
	static final double PI = 3.14;// 成员变量final必须初始化
	static int age = 0;
	static void printIn() {
		System.out.println(age);
	}
	
	public static void main(String[] args) {/*static main only 
		can access static in the class*/
		final int number;
		number = 1234;
		age = 22;
		System.out.println(PI);
		System.out.println(number);
		System.out.println(age);
		printIn();
	}

	
}
