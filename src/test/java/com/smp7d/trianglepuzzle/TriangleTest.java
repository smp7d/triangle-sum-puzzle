package com.smp7d.trianglepuzzle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testCalculateLargestSum() {
		List<List<TriangleNode>> triangleData = new ArrayList<List<TriangleNode>>(
				4);
		triangleData.add(Arrays.asList(new TriangleNode(5)));
		triangleData.add(Arrays
				.asList(new TriangleNode(9), new TriangleNode(6)));
		triangleData.add(Arrays.asList(new TriangleNode(4),
				new TriangleNode(6), new TriangleNode(8)));
		triangleData.add(Arrays.asList(new TriangleNode(0),
				new TriangleNode(7), new TriangleNode(1), new TriangleNode(5)));

		Triangle triangle = new Triangle(triangleData);
		Assert.assertEquals(27, triangle.calculateLargestSum());
	}

	@Test
	public void testCalculateLargestSum_withNegativeNumbers() {
		List<List<TriangleNode>> triangleData = new ArrayList<List<TriangleNode>>(
				4);
		triangleData.add(Arrays.asList(new TriangleNode(0)));
		triangleData.add(Arrays
				.asList(new TriangleNode(1), new TriangleNode(2)));
		triangleData.add(Arrays.asList(new TriangleNode(2),
				new TriangleNode(3), new TriangleNode(1)));
		triangleData.add(Arrays.asList(new TriangleNode(-10), new TriangleNode(
				-15), new TriangleNode(-7), new TriangleNode(-8)));

		Triangle triangle = new Triangle(triangleData);
		Assert.assertEquals(-2, triangle.calculateLargestSum());
	}

	@Test
	public void testCalculateLargestSum_fromFile() throws IOException {
		Triangle triangle = new Triangle("test-triangle-data.txt");
		Assert.assertEquals(27, triangle.calculateLargestSum());
	}
	
	@Test
	public void testCalculateLargestSum_fromFileWithNegativeNumbers() throws IOException {
		Triangle triangle = new Triangle("test-triangle-data-with-neg-number.txt");
		Assert.assertEquals(-2, triangle.calculateLargestSum());
	}
}
