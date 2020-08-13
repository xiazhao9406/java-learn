package com.javalearn.chapter06;
import java.util.Arrays;

public class Rakel {
	public static void main(String[] args) {
		String str[] = new String[] {
		     "ab", "cd", "ef", "yz"		
		};
		int index = Arrays.binarySearch(str, 0, 2, "cd");
		System.out.println("cd is in: " + index);
		
	}

}
