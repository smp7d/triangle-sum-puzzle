package com.smp7d.trianglepuzzle;

import java.io.IOException;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class TriangleDataLoaderTest {
	@Test
	public void testLoad() throws IOException {
		List<List<TriangleNode>> triangleData = new TriangleDataLoader()
				.load("test-triangle-data.txt");
		int rowLength = 1;
		for (List<TriangleNode> row : triangleData) {
			Assert.assertEquals(rowLength++, row.size());
		}
	}

	@Test
	public void testLoad_withNegativeNumbers() throws IOException {
		List<List<TriangleNode>> triangleData = new TriangleDataLoader()
				.load("test-triangle-data-with-neg-number.txt");
		int rowLength = 1;
		boolean foundNegative = false;
		for (List<TriangleNode> row : triangleData) {
			Assert.assertEquals(rowLength++, row.size());
			if (!foundNegative) {
				for (TriangleNode node : row) {
					foundNegative = foundNegative || (node.getValue() < 0);
				}
			}
		}
		Assert.assertTrue(foundNegative);
	}
}
