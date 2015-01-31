package com.constructor;

public class Person {
	
	String name;
	int age;
	
	Person(){
		this("Laze",7);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
