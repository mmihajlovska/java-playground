package com.example3;

import org.junit.Assert;
import org.junit.Test;

public class NumTest {

	@Test
	public void testNum() {
		
		Num nb = new Num(10);
		Assert.assertEquals(nb.get(), 10);

		Num result = nb.addition(5);
		Assert.assertEquals(result.get(), 15);

		nb.set(100);
		Assert.assertEquals(nb.get(), 100);
		Assert.assertEquals(result.get(), 105);

		nb.set(500);
		result = nb.addition(10);
		Assert.assertEquals(result.get(), 510);

		result = nb.subtraction(200);
		Assert.assertEquals(result.get(), 300);

		nb.set(100);
		result = nb.multiplication(2);
		Assert.assertEquals(result.get(), 200);
		
		result = nb.division(2);
		Assert.assertEquals(result.get(), 50);
	}
		
	@Test
	public void testText() {
		
		Text text = new Text("a");
		Assert.assertEquals(text.get(), "a");
		
		Text result = text.addition("b");
		Assert.assertEquals(result.get(), "ab");

		text.set("cd");
		Assert.assertEquals(text.get(), "cd");
		Assert.assertEquals(result.get(), "cdb");

		text.set("ab");
		result = text.addition("cd");
		Assert.assertEquals(result.get(), "abcd");
		
	}
}
