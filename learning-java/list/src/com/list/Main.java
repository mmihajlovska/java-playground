package com.list;

public class Main {
	public static void main(String[] args) {
		List list = new MyList();
		printList(list);

		list.add("prvo");
		printList(list);

		list.add("vtoro");
		printList(list);

		List copy = list.clone();
		printList(copy);

		list.add("treto");
		printList(list);

		list.remove("treto");
		printList(list);

		List lista = new MyList();
		lista.add("a");
		lista.add("b");

		List items = new MyList();
		items.add("c");
		items.add("d");

		lista.addAll(items);
		System.out.println(lista);

		lista.retainAll(items);
		System.out.println(lista);

		lista.removeAll(items);
		System.out.println(lista);

		lista.clear();
		System.out.println(lista);

		ArrList arr = new ArrList();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		arr.remove("b");
		System.out.println(arr);
	}

	public static void printList(List list) {
		System.out.println(list);
	}
}