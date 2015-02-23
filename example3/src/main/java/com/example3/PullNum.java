package com.example3;

public class PullNum implements Num {

	protected int val;
	protected PullNum elem;
	protected int additionallyVal;

	public PullNum(int i) {
		this.val = i;
	}

	@Override
	public PullNum addition(int i) {
		PullNum e = new PlusPullNum(val + i);
		return setElem(e, i);
	}

	@Override
	public PullNum subtraction(int i) {
		PullNum e = new MinusPullNum(val - i);
		return setElem(e, i);
	}

	@Override
	public PullNum multiplication(int i) {
		PullNum e = new MultiplyPullNum(val * i);
		return setElem(e, i);
	}

	@Override
	public PullNum division(int i) {
		PullNum e = new DividePullNum(val / i);
		return setElem(e, i);
	}

	public PullNum setElem(PullNum e, int i) {
		e.elem = this;
		e.additionallyVal = i;
		return e;
	}

	@Override
	public void set(int i) {
		val = i;
	}

	@Override
	public int get() {
		return val;
	}
}
