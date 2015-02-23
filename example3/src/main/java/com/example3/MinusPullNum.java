package com.example3;

public class MinusPullNum extends PullNum {

	public MinusPullNum(int i) {
		super(i);
	}

	@Override
	public int get() {
		return elem.get() - additionallyVal;
	}

}
