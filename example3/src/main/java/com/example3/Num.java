package com.example3;

public interface Num {

	Num addition(int i);

	Num subtraction(int i);

	Num multiplication(int i);

	Num division(int i);

	void add(String o, PushNum e, int i);

	void set(int i);

	int get();
	
	PushNum setElem(String o, PushNum e, int i);

	PullNum setElem(String o, PullNum e, int i);
}

