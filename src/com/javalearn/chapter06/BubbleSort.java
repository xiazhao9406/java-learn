package com.javalearn.chapter06;


public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {
				63, 4, 24, 1, 3, 15
		};
		BubbleSort sorter = new BubbleSort();
		sorter.sort(arr);
	}
		
		public void sort(int[] array) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			showArray(array);
			
		}
		public void showArray(int[] array) {
			for (int x: array) {
				System.out.print(" > " + x);
			}
			System.out.println();
		}
}
