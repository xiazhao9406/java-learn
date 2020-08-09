package com.javalearn.charpter03;

public class Conver {
	public static void main(String[] args) {
		byte mybyte = 123;
		int myint = 150;
		float myfloat = 234.33f;
		char mychar = 10;
		double mydouble = 23.33345;
		
		System.out.println("byte + float: " + (mybyte + myfloat));
		System.out.println("byte + int: " + (mybyte + myint));
		System.out.println("byte + char: " + (mybyte + mychar));
		System.out.println("double + char: " + (mydouble + mychar));
		
		int a = (int)45.23;
		long b = (long)456.4f;
		int c = (int)'d';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
