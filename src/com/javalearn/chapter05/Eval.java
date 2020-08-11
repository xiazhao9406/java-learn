package com.javalearn.chapter05;
import java.util.Date;
import java.util.Locale;

public class Eval {
	public static void main(String[] args) {
		Date date = new Date();
		String year = String.format("%tY", date);
		String month = String.format(Locale.CHINA, "%tB", date);
		String day = String.format("%td", date);
		
		System.out.println("the current year is: " + year);
		System.out.println("the current month is: " + month);
		System.out.println("the current date is: " + day);
	}

}
