package com.javalearn.chapter07;

public class TransferProperty {
	int i = 47;
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
		
		t2.i = 60;
		t1.call();
		t2.call();
	}
	
	
	

}
