package com.example3;

public class Num {

	private int x;

	public Num(int i) {
		this.x = i;
	}

	public Num plus(int i) {
		Num y = new Num(x + i);
		return y;
	}

	public void set(int i) {
		x = i;
	}

	public int get() {
		return x;
	}
	
}
