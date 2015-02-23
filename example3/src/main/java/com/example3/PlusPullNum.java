package com.example3;

public class PlusPullNum extends PullNum {

	public PlusPullNum(int i) {
		super(i);
	}

	@Override
	public int get() {
		return elem.get() + additionallyVal;
	}

}
