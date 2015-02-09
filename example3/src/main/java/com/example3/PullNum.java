package com.example3;

public class PullNum {

	private int val;
	private int additionallyVal = 0;
	private String operator;
	private PullNum elem;

	public PullNum(int i) {
		this.val = i;
	}

	public PullNum addition(int i) {
		PullNum e = new PullNum(val + i);
		return setElem("+", e, i);
	}

	public PullNum subtraction(int i) {
		PullNum e = new PullNum(val - i);
		return setElem("-", e, i);
	}

	public PullNum multiplication(int i) {
		PullNum e = new PullNum(val * i);
		return setElem("*", e, i);
	}

	public PullNum division(int i) {
		PullNum e = new PullNum(val / i);
		return setElem("/", e, i);
	}

	
	public PullNum setElem(String o, PullNum e, int i) {
		e.elem = this;
		e.additionallyVal = i;
		e.operator = o;
		return e;
	}

	public void set(int i) {
		val = i;
	}

	public int get() {
		if (this.elem != null) {
			
			PullNum e = this.elem;
			
			if (operator == "+") {
				val = e.val + additionallyVal;
			} else if (operator == "*") {
				val = e.val * additionallyVal;
			} else if (operator == "/") {
				val = e.val / additionallyVal;
			} else {
				val = e.val - additionallyVal;;
			}	
		}
		
		return val;
	}
}
