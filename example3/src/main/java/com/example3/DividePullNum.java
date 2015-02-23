package com.example3;

public class DividePullNum extends PullNum {

	public DividePullNum(int i) {
		super(i);
	}

	@Override
	public int get() {
		return elem.get() / additionallyVal;
	}
}
