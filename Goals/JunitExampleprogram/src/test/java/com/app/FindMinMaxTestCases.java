package com.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FindMinMaxTestCases {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}
	
	@Test
	public void testCube(){
		System.out.println("test case cube");
		assertEquals(27,FindMinMax.numberCube(3));
	}

	@Test
	public void testFindMax(){
		System.out.println("test case find max");
		assertEquals(4,FindMinMax.findMax(new int[]{1,3,4,2}));
		assertEquals(0,FindMinMax.findMax(new int[]{-12,-3,-4,0}));
	}
	
	
}
