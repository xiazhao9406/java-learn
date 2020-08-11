package com.javalearn.chapter04;
// switch can be a string in JDK 1.7
public class GetTerm {
	public static void main(String[] args) {
		String str = "tomorrow of technology";
		switch(str) {
		case "tomorrow":
			System.out.println("the web of tomorrow of the technology");
			break;
		case "tomorrow of technology":
			System.out.println("company");
			break;
		default:
			System.out.println("none");
		}
	}

}
