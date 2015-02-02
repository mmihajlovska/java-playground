package com.example3;

public class Num {

	private int val;
	private int plus = 0;
	private Num elem;

	public Num(int i) {
		this.val = i;
	}

	public Num plus(int i) {
		Num e = new Num(val + i);
		elem = e;
		plus = i;
		return e;
	}

	public void set(int i) {
		val = i;
		elem.val = val + plus;
	}

	public int get() {
		return val;
	}
}
