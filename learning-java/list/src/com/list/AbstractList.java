package com.list;

public abstract class AbstractList {

	public String getFirstElem() {
		return size() > 0 ? get(0) : null;
	}

	public String getLastElem() {
		return size() > 0 ? get(size() - 1) : null;
	}

	public boolean addAll(List items) {
		for (int i = 0; i < items.size(); i++) {
			add(items.get(i));
		}

		return items.size() != 0;
	}

	public boolean addAll(String... elements) {
		for (int i = 0; i < elements.length; i++) {
			add(elements[i]);
		}

		return elements.length != 0;
	}

	public boolean removeAll(List items) {
		for (int i = 0; i < items.size(); i++) {
			remove(items.get(i));
		}

		return items.size() != 0;
	}

	public boolean removeAll(String... elements) {
		for (int i = 0; i < elements.length; i++) {
			remove(elements[i]);
		}

		return elements.length != 0;
	}

	public boolean containsAll(String... elements) {
		int size = 0;

		for (int i = 0; i < elements.length; i++) {
			if (contains(elements[i])) {
				size++;
			}
		}

		return size == elements.length;
	}

	public boolean containsAll(List items) {
		int size = 0;

		for (int i = 0; i < items.size(); i++) {
			if (contains(items.get(i))) {
				size++;
			}
		}

		return size == items.size();
	}

	public boolean retainAll(List items) {
		List copy = clone();
		clear();
		for (int i = 0; i < copy.size(); i++) {
			for (int j = 0; j < items.size(); j++) {
				if (copy.get(i).equals(items.get(j))) {
					this.add(copy.get(i));
				}
			}
		}

		return items.size() != 0;
	}

	public boolean retainAll(String... elements) {
		List copy = clone();
		clear();
		for (int i = 0; i < copy.size(); i++) {
			for (int j = 0; j < elements.length; j++) {
				if (copy.get(i).equals(elements[j])) {
					this.add(copy.get(i));
				}
			}
		}

		return elements.length != 0;
	}

	public abstract int size();

	public abstract String get(int index);

	public abstract void add(String item);

	public abstract void remove(String item);

	public abstract boolean contains(String item);

	public abstract void clear();

	public abstract List clone();

}
