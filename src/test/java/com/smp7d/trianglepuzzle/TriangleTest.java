package com.smp7d.trianglepuzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testCalculateLargestSum(){
		List<List<TriangleNode>> triangleData = new ArrayList<List<TriangleNode>>(4);
		triangleData.add(Arrays.asList(new TriangleNode(5)));
		triangleData.add(Arrays.asList(new TriangleNode(9), new TriangleNode(6)));
		triangleData.add(Arrays.asList(new TriangleNode(4), new TriangleNode(6), new TriangleNode(8)));
		triangleData.add(Arrays.asList(new TriangleNode(0), new TriangleNode(7), new TriangleNode(1), new TriangleNode(5)));
		
		Triangle triangle = new Triangle(triangleData);
		Assert.assertEquals(27, triangle.calculateLargestSum());
	}
}
