package com.example3;

public class PushNum implements Num {

	private int val;
	private int additionallyVal = 0;
	private String operator;
	private PushNum head;
	private PushNum next;

	public PushNum(int i) {
		this.val = i;
	}

	@Override
	public PushNum addition(int i) {
		PushNum e = new PushNum(val + i);
		return setElem("+", e, i);
	}

	@Override
	public PushNum subtraction(int i) {
		PushNum e = new PushNum(val - i);
		return setElem("-", e, i);
	}

	@Override
	public PushNum multiplication(int i) {
		PushNum e = new PushNum(val * i);
		return setElem("*", e, i);
	}

	@Override
	public PushNum division(int i) {
		PushNum e = new PushNum(val / i);
		return setElem("/", e, i);
	}

	public void add(String o, PushNum e, int i) {
		e.operator = o;
		e.additionallyVal = i;

		if (head == null) {
			head = e;
		} else {
			PushNum last = getLastElement();
			last.next = e;
		}
	}

	private PushNum getLastElement() {
		PushNum el = head;

		while (el.next != null) {
			el = el.next;
		}

		return el;
	}
	
	public PushNum setElem(String o, PushNum e, int i) {
		add(o, e, i);
		return e;
	}

	@Override
	public void set(int i) {
		val = i;

		PushNum elem = head;

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

	@Override
	public int get() {
		return val;
	}

}
