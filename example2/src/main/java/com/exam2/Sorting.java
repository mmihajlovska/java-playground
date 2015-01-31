package com.exam2;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

	public static void main(String[] args) {

		Book[] books = { new Book("ccc", 1990), new Book("b", 1843),
				new Book("aa", 2015) };

		System.out.println(books instanceof Book[]);

		Arrays.sort(books);

		System.out.println(Arrays.toString(books));

		Arrays.sort(books, new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				return Integer.compare(o1.getYear(), o2.getYear());
			}
		});

		System.out.println(Arrays.toString(books));
	}
}
