package com.javalearn.chapter06;

public class GetDay {
	public static void main(String[] args) {
		int[] day = new int[] {
				31, 28, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31
			};
		for (int i = 0; i < day.length; i++) {
			System.out.println((i + 1) + " month has " + day[i] + " days");
		}
	}

}
