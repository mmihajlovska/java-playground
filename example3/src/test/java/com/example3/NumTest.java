package com.example3;

import org.junit.Assert;
import org.junit.Test;

public class NumTest {

	@Test
	public void testNum() {
		Num x = new Num(10);
		Assert.assertEquals(x.get(), 10);

		Num y = x.addition(5);
		Assert.assertEquals(y.get(), 15);

		x.set(100);
		Assert.assertEquals(x.get(), 100);
		Assert.assertEquals(y.get(), 105);

		x.set(500);
		y = x.addition(10);
		Assert.assertEquals(y.get(), 510);

		y = x.subtraction(200);
		Assert.assertEquals(y.get(), 300);

		y = x.multiplication(2);
		Assert.assertEquals(y.get(), 1000);

	}
}
