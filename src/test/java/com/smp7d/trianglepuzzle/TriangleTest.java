package com.smp7d.trianglepuzzle;

import junit.framework.Assert;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testCalculateLargestSum(){
		Triangle triangle = new Triangle();
		Assert.assertEquals(27, triangle.calculateLargestSum());
	}
}
