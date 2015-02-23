package com.example3;

public class MultiplyPullNum extends PullNum {

	public MultiplyPullNum(int i) {
		super(i);
	}

	@Override
	public int get() {
		return elem.get() * additionallyVal;
	}
}
