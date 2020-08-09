package com.javalearn.charpter03;

public class Gess {
	public static void main(String[] args) {
		char word = 'd', word2 = '@';
		int p = 23045 , p2 = 45213;
		System.out.println("the unicode of d is: " + (int)word);
		System.out.println("the unicode of @ is: " + (int)word2);
		System.out.println("unicode of 23045 is: " + (char)23045);
		System.out.println("unicode of 45213 is: " + (char)45213);
		//char convert to int, int convert to char. depend on unicode.
		
		char c1 = '\\';
		char char1 = '\u2605';
		System.out.println(c1);
		System.out.println(char1);
		//Escape character.
		
		boolean b;
		boolean b1, b2;
		boolean b3 = true, b4 = false;
		System.out.println(b3);
		//the definition of type of boolean.
	}


}
