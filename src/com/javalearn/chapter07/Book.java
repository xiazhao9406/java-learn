package com.javalearn.chapter07;

public class Book {
	private String name;
	
	public static void generateName() 
	{
		
	}
	
	public String getName() {
		int id = 0;
		setName("Java");
		return id + this.name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public Book getBook() {
		return this;
	}
	
	public static void main(String[] args) {
		generateName();
		//getName(); // Can't call, since we need a class object to call it.
//		Book book = book.getBook();
		Book book = new Book();
		book = book.getBook();
		String name = book.getName();
		book.setName("xia zhao");
		System.out.print("name = " + book.name);
	}

}
