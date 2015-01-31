package com.list;

public interface List {

	void add(String item);

	void remove(String item);

	boolean addAll(String... elements);

	boolean addAll(List items);

	boolean removeAll(String... items);

	boolean removeAll(List items);

	int size();

	boolean contains(String item);

	String get(int index);

	void clear();

	String getFirstElem();

	String getLastElem();

	boolean retainAll(List items);

	boolean retainAll(String... elements);

	boolean containsAll(String... elements);

	boolean containsAll(List items);

	List clone();

}
