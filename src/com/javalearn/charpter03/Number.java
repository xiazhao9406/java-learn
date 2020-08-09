package com.javalearn.charpter03;

public class Number {
	public static void main(String[] args) {
		byte mybyte = 124;//-128~127;
		short myshort = 32564;
		int myint = 45784590;
		long mylong = 45568793457L;/*默认是int， 如果超出int范围需要大写L，
		或l*/
		long result = mybyte + myshort + myint + mylong;
		System.out.println("the result is : " + result);
	}

}
