package com.example3;

import org.junit.Assert;
import org.junit.Test;

public class NumTest {

	@Test
	public void testPushNum1() {

		PushNum nb = new PushNum(10);
		Assert.assertEquals(nb.get(), 10);

		PushNum result = nb.addition(5);
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
	public void testPushNum2() {
		PushNum x = new PushNum(10);
		Assert.assertEquals(x.get(), 10);

		PushNum y = x.addition(5);
		Assert.assertEquals(y.get(), 15);

		y = x.subtraction(3);
		Assert.assertEquals(y.get(), 7);

		PushNum z = x.addition(10);
		
		x.set(100);

		Assert.assertEquals(z.get(), 110);

		PushNum w = z.addition(5);
		Assert.assertEquals(w.get(), 115);
		
		z.set(50);
		Assert.assertEquals(w.get(), 55);

	}

	@Test
	public void testPullNum() {

		PullNum x = new PullNum(10);
		Assert.assertEquals(x.get(), 10);

		PullNum y = x.addition(5);
		PullNum z = x.subtraction(5);
		PullNum w = z.multiplication(2);
		PullNum q = w.division(2);
		
		Assert.assertEquals(y.get(), 15);
		Assert.assertEquals(z.get(), 5);
		Assert.assertEquals(w.get(), 10);
		Assert.assertEquals(q.get(), 5);
		
		x.set(200);
		
		Assert.assertEquals(x.get(), 200);
		Assert.assertEquals(y.get(), 205);
		Assert.assertEquals(z.get(), 195);
		
		z.set(50);
		Assert.assertEquals(w.get(), 100);
		
		w.set(60);
		Assert.assertEquals(q.get(), 30);
		
		y.set(100);
		
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
