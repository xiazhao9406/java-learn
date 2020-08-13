package com.javalearn.chapter07;

public class StaticTest {
	final static double PI = 3.1415;
	static int id;
	
	public static void method1() {
		System.out.println("I love you");
	}
	
	public void method2() {
		System.out.println(StaticTest.PI);
		System.out.println(StaticTest.id);
		StaticTest.method1();	
	}
	public static void main(String[] args) {
		StaticTest.method1();
		
		StaticTest test = new StaticTest();
		test.method2();
	}
	//wrong code in static function cannot use non-static functions and key word 
	//this
	//public static StaticTest method3() {
		//method2();
		//return this;
	//}
	
}
