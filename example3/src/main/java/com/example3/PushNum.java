package com.example3;

import java.util.ArrayList;
import java.util.List;

public class PushNum implements Num {

	private int val;
	private int additionallyVal = 0;
	private String operator;
	private List<PushNum> list = new ArrayList<PushNum>();

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

	public PushNum setElem(String o, PushNum e, int i) {
		e.operator = o;
		e.additionallyVal = i;
		list.add(e);
		return e;
	}

	@Override
	public void set(int i) {
		val = i;

		for (PushNum elem : list) {

			if (elem.operator == "+") {
				elem.val = val + elem.additionallyVal;
			} else if (elem.operator == "*") {
				elem.val = val * elem.additionallyVal;
			} else if (elem.operator == "/") {
				elem.val = val / elem.additionallyVal;
			} else {
				elem.val = val - elem.additionallyVal;
			}

		}
	}

	@Override
	public int get() {
		return val;
	}

}
