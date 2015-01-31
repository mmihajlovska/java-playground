package com.list;

import org.junit.Assert;
import org.junit.Test;

public class ListTest {

	@Test
	public void testList() {
		exersize1(new MyList());
		exersize1(new ArrList());
	}

	private void exersize1(List list) {
		Assert.assertEquals((list.size()), 0);
		Assert.assertEquals(list.getFirstElem(), null);
		Assert.assertEquals(list.getLastElem(), null);

		list.add("prvo");
		Assert.assertTrue(list.contains("prvo"));
		Assert.assertEquals((list.size()), 1);
		Assert.assertEquals(list.getLastElem(), "prvo");

		list.add("vtoro");
		Assert.assertTrue(list.contains("vtoro"));
		Assert.assertEquals((list.size()), 2);
		Assert.assertEquals(list.getLastElem(), "vtoro");

		list.add("treto");
		Assert.assertTrue(list.contains("treto"));
		Assert.assertEquals((list.size()), 3);
		Assert.assertEquals(list.getLastElem(), "treto");

		Assert.assertEquals((list.get(0)), "prvo");
		Assert.assertEquals((list.get(1)), "vtoro");
		Assert.assertEquals((list.get(2)), "treto");

		list.remove("treto");
		Assert.assertFalse(list.contains("treto"));
		Assert.assertEquals((list.size()), 2);
		Assert.assertEquals(list.getLastElem(), "vtoro");

		Assert.assertEquals((list.get(0)), "prvo");
		Assert.assertEquals((list.get(1)), "vtoro");

		Assert.assertEquals(list.getFirstElem(), "prvo");

		Assert.assertEquals(list.getLastElem(), "vtoro");
	}

	@Test
	public void testList2() {
		exercise2(new MyList());
		exercise2(new ArrList());
	}

	private void exercise2(List lista) {
		Assert.assertEquals((lista.size()), 0);

		lista.add("a");
		Assert.assertTrue(lista.contains("a"));
		Assert.assertEquals((lista.size()), 1);

		lista.add("b");
		Assert.assertTrue(lista.contains("b"));
		Assert.assertEquals((lista.size()), 2);

		MyList cd = new MyList("c", "d");
		MyList ab = new MyList("a", "b");
		MyList ca = new MyList("c", "a");
		MyList abcde = new MyList("a", "b", "c", "d", "e");
		Assert.assertEquals((abcde.size()), 5);

		Assert.assertTrue(lista.addAll(cd));

		Assert.assertTrue(lista.contains("c"));
		Assert.assertTrue(lista.contains("d"));
		Assert.assertEquals((lista.size()), 4);

		Assert.assertTrue(lista.retainAll(ab));

		Assert.assertTrue(lista.contains("a"));
		Assert.assertTrue(lista.contains("b"));
		Assert.assertEquals((lista.size()), 2);

		Assert.assertTrue(lista.addAll(cd));

		Assert.assertTrue(lista.removeAll(cd));
		Assert.assertEquals((lista.size()), 2);

		Assert.assertFalse(lista.contains("c"));
		Assert.assertFalse(lista.contains("d"));

		lista.clear();
		Assert.assertEquals((lista.size()), 0);

		Assert.assertTrue(lista.addAll("a", "b", "c", "d", "e"));
		Assert.assertEquals((lista.size()), 5);

		Assert.assertTrue(lista.removeAll("b", "d"));
		Assert.assertEquals((lista.size()), 3);

		Assert.assertTrue(lista.retainAll("a", "c"));
		Assert.assertEquals((lista.size()), 2);

		Assert.assertTrue(lista.containsAll("c", "a"));
		Assert.assertTrue(lista.containsAll(ca));
	}

}
