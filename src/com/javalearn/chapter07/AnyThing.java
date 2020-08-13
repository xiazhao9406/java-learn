package com.javalearn.chapter07;

public class AnyThing {
	public AnyThing() {
		this("this uses the constructor function of having elements");
		System.out.println("the construct function of no parameters");
	}
	
	public AnyThing(String str) {
		System.out.println("the constructor function has parameters");
	}
	
	public static void main(String[] args) {
		AnyThing anything = new AnyThing("hh");
	}
	
}
