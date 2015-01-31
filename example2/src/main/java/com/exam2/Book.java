package com.exam2;

public class Book implements Comparable<Book> {

	private String name;

	private int year;

	public Book(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public int compareTo(Book b) {
		return name.compareTo(b.name);
	}

	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return name + "(" + year + ")";
	}

}
