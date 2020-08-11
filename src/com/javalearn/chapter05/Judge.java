package com.javalearn.chapter05;

public class Judge {
	public static void main(String[] args) {
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String str1 = "aaa@";
		String str2 = "aaaa";
		String str3 = "111@gmail.com.cn";
		
		if (str1.matches(regex)) {
			System.out.println(str1 + "is a vaild email adress");
		}
		if (str2.matches(regex)) {
			System.out.println(str2 + "is a vaild email address");
		}
		if (str3.matches(regex)) {
			System.out.println(str3 + "is a vaild email address");
		}
	}

}
