package com.example3;

public class Num {

	private int val;
	private int additionallyVal = 0;
	private Num elem;
	private String operator;

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
	
	public Num setElem(String o, Num e, int i) {
		operator = o;
		elem = e;
		additionallyVal = i;
		return e;
	}

	public void set(int i) {
		val = i;
		
		if (operator == "+") {
			elem.val = val + additionallyVal;
		} else if(operator == "*"){
			elem.val = val * additionallyVal;
		} else if(operator == "/"){
			elem.val = val / additionallyVal;
		}else{
			elem.val = val - additionallyVal;
		}
	}

	public int get() {
		return val;
	}

}
