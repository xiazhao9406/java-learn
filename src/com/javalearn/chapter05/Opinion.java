package com.javalearn.chapter05;

public class Opinion {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "ABC";
		String str3 = "abc";
		//比较两个字符串的方法
		boolean b1 = str1.equals(str2);
		boolean b2 = str1.equalsIgnoreCase(str2);
	    boolean b3 = str1.equals(str3);
	    
	    System.out.println(b1);
	    System.out.println(b2);
	    System.out.println(b3);
	}

}
