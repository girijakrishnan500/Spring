package com.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMinMaxTest {

	@Test
	public void testFindMax() {
		assertEquals(4, FindMinMax.findMax(new int[] { 1, 3, 4, 2 }));
	}

}
