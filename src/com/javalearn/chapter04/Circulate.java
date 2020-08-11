package com.javalearn.chapter04;

public class Circulate {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		
		System.out.println("sum = " + sum);
		
		
		// using for(;;) to realize an infinite loop.
		int x = 0;
		for (;;) {
			if (x > 20)
				break;
			x++;
		}
		System.out.println("stop " + x);
	}

}
