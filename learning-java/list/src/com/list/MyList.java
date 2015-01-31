package com.list;

public class MyList extends AbstractList implements List {

	private ListElement head;

	public MyList(String... elements) {
		for (int i = 0; i < elements.length; i++) {
			add(elements[i]);
		}
	}

	@Override
	public void add(String item) {
		ListElement elem = new ListElement();
		elem.value = item;
		if (head == null) {
			head = elem;
		} else {
			ListElement last = getLastElement();
			last.next = elem;
		}
	}

	@Override
	public void clear() {
		this.head = null;
	}

	@Override
	public List clone() {
		List copy = new MyList();
		copy.addAll(this);
		return copy;
	}

	private ListElement getLastElement() {
		ListElement el = head;

		while (el.next != null) {
			el = el.next;
		}

		return el;
	}

	@Override
	public int size() {
		ListElement el = head;
		int size = 0;

		while (el != null) {
			size += 1;
			el = el.next;
		}

		return size;
	}

	@Override
	public String toString() {
		String s = "[";
		ListElement el = head;

		while (el != null) {
			s += el.value;

			if (el.next != null) {
				s += ", ";
			}

			el = el.next;
		}

		return s + "]";
	}

	@Override
	public boolean contains(String item) {
		ListElement el = head;

		while (el != null) {
			if (el.value.equals(item)) {
				return true;
			} else {
				el = el.next;
			}
		}
		return false;
	}

	@Override
	public String get(int item) {
		ListElement el = head;
		int i = 0;
		while (el != null) {
			if (i == item) {
				return el.value;
			} else {
				i++;
				el = el.next;
			}
		}
		return null;
	}

	@Override
	public void remove(String item) {
		ListElement currentEl = head;
		ListElement prevEl = null;
		ListElement nextEl = null;

		while (currentEl != null) {
			if (currentEl.value.equals(item)) {
				if (currentEl == head) {
					head = currentEl.next;
				} else {
					prevEl.next = nextEl;
				}
				return;
			} else {
				prevEl = currentEl;
				currentEl = currentEl.next;
				if (currentEl != null) {
					nextEl = currentEl.next;
				} else {
					nextEl = null;
				}
			}
		}
	}
}
