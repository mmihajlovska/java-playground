package com.exam2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String args[]) {
		String[] words = { "ccc", "bb", "d", "aaaa" };

		System.out.println(Arrays.toString(words));

		Arrays.sort(words);
		System.out.println(Arrays.toString(words));

		Comparator<String> comparator = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};

		Arrays.sort(words, comparator);

		System.out.println(Arrays.toString(words));
	}

}
