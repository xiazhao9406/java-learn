package com.javalearn.chapter07;

public class AccessProperty {
	static int i = 47;
	public void call(){
		System.out.println("use this method ");
		for (i = 0; i < 3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TransferProperty t1 = new TransferProperty();
		TransferProperty t2 = new TransferProperty();
		
		t1.i = 60;
		System.out.println(" i = " + t1.i);
		t1.call();
	
		t2.call();
		System.out.println(" i = " + t2.i);
	}
}

