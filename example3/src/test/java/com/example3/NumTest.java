package com.example3;

import org.junit.Assert;
import org.junit.Test;

public class NumTest  {
	
	@Test
	public void testList() {
		testNum(new PushNum(10));
		testNum(new PullNum(10));
	}
	
	public void testNum(Num nb) {

		Num x = nb;
		Assert.assertEquals(x.get(), 10);

		Num y = x.addition(5);
		Num z = x.subtraction(5);
		Num w = z.multiplication(2);
		Num q = w.division(2);
		
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
