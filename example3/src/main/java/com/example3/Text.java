package com.example3;

public class Text {

	private String val;
	private String additionallyVal = "";
	private Text elem;

	public Text(String s) {
		this.val = s;
	}

	public Text addition(String s) {
		Text e = new Text(val + s);
		return setElem(e, s);
	}

	public Text setElem(Text e, String s) {
		elem = e;
		additionallyVal = s;
		return e;
	}

	public void set(String s) {
		val = s;
		elem.val = val + additionallyVal;
	}

	public String get() {
		return val;
	}

}
