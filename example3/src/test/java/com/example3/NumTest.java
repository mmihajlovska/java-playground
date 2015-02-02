package com.example3;

import org.junit.Assert;
import org.junit.Test;

public class NumTest {
	
	@Test
	public void testNum() {
		Num x = new Num(10);
		Assert.assertEquals(x.get(), 10);
		Num y = x.plus(5);
		Assert.assertEquals(y.get(), 15);
		x.set(100);
		Assert.assertEquals(x.get(), 100);
		Assert.assertEquals(y.get(),105);
		x.set(500);
		y = x.plus(10);
		Assert.assertEquals(y.get(),510);
	}
}
