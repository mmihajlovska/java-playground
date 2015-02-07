package com.example3;

public class Num {

	private int val;
	private int additionallyVal = 0;
	private String operator;
	private Num head;
	private Num next;

	public Num(int i) {
		this.val = i;
	}

	public Num addition(int i) {
		Num e = new Num(val + i);
		return setElem("+", e, i);
	}

	public Num subtraction(int i) {
		Num e = new Num(val - i);
		return setElem("-", e, i);
	}

	public Num multiplication(int i) {
		Num e = new Num(val * i);
		return setElem("*", e, i);
	}

	public Num division(int i) {
		Num e = new Num(val / i);
		return setElem("/", e, i);
	}

	public void add(String o, Num e, int i) {
		e.operator = o;
		e.additionallyVal = i;

		if (head == null) {
			head = e;
		} else {
			Num last = getLastElement();
			last.next = e;
		}
	}

	private Num getLastElement() {
		Num el = head;

		while (el.next != null) {
			el = el.next;
		}

		return el;
	}

	public Num setElem(String o, Num e, int i) {
		add(o, e, i);
		return e;
	}

	public void set(int i) {
		val = i;

		Num elem = head;

		while (elem != null) {

			if (elem.operator == "+") {
				elem.val = val + elem.additionallyVal;
			} else if (elem.operator == "*") {
				elem.val = val * elem.additionallyVal;
			} else if (elem.operator == "/") {
				elem.val = val / elem.additionallyVal;
			} else {
				elem.val = val - elem.additionallyVal;
			}

			elem = elem.next;
		}
	}

	public int get() {
		return val;
	}
}
