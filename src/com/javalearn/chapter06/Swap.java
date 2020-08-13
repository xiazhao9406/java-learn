package com.javalearn.chapter06;
import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Arrays.fill(arr, 8);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " element in the array is: " + arr[i]);
		}
		String[] str = new String[6];
		Arrays.fill(str, "haha");
		for (String a: str) {
			System.out.println(a);
		}
		
	}
}
// using Arrays.fill() fill array the same value.