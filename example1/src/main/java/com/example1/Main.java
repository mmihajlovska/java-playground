package com.example1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.rapidoid.util.U;

public class Main {
	public static void main(String args[]) {
		// Map
		Map<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "a");
		hmap.put(2, "b");
		hmap.put(3, "c");
		hmap.put(4, "d");
		System.out.println("HashMap " + hmap);

		// another way HashMap
		Map<Integer, String> hm1 = U.map(1, "a", 2, "b", 3, "c", 4, "d");
		System.out.println(hm1);

		Map<String, Double> hm2 = U.map("first", 77.39, "second", 45.898);
		System.out.println(hm2);

		Map<String, String> hm3 = U.map("car1", "red", "car2", "blue");
		System.out.println(hm3);

		// Set
		Set<String> setA1 = new HashSet<String>();
		setA1.add("e1");
		setA1.add("e2");
		setA1.add("e3");
		System.out.println("HashSet " + setA1);

		Set<Integer> setB1 = new LinkedHashSet<Integer>();

		setB1.add(2);
		setB1.add(1);
		setB1.add(3);
		System.out.println("LinkedHashSet " + setB1);

		Set<Integer> setC1 = new TreeSet<Integer>();

		setC1.add(3);
		setC1.add(1);
		setC1.add(2);
		System.out.println("TreeSet " + setC1);

		// another way HashSet
		Set<String> setA2 = U.set("e1", "e2", "e3");
		System.out.println("another way HashSet " + setA2);

		// List
		List<String> listA = new ArrayList<String>();
		listA.add("a");
		listA.add("b");
		listA.add("c");
		System.out.println("List " + listA);

		// another way List
		List<String> listB = U.list("a", "b", "c");
		System.out.println("another way List " + listB);
	}
}