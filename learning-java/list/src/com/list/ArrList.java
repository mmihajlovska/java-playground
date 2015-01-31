package com.list;

import java.util.Arrays;

public class ArrList extends AbstractList implements List {

	private String[] elements = new String[0];

	public ArrList(String... elements) {
		for (int i = 0; i < elements.length; i++) {
			add(elements[i]);
		}
	}

	@Override
	public void add(String item) {
		elements = Arrays.copyOf(elements, elements.length + 1);
		elements[elements.length - 1] = item;
	}

	@Override
	public void remove(String item) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i].equals(item)) {
				for (int j = i; j < elements.length - 1; j++) {
					elements[j] = elements[j + 1];
				}
			}
		}
		elements = Arrays.copyOf(elements, elements.length - 1);
	}

	@Override
	public int size() {
		return elements.length;
	}

	@Override
	public boolean contains(String item) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i].equals(item)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		return elements[index];
	}

	@Override
	public void clear() {
		elements = new String[0];
	}

	@Override
	public String toString() {
		String s = "[";
		for (int i = 0; i < elements.length; i++) {
			s += elements[i];
			if (i != elements.length - 1) {
				s += ",";
			}
		}
		return s + "]";
	}

	@Override
	public List clone() {
		List copy = new ArrList();
		copy.addAll(this);
		return copy;
	}

}
