package com.smp7d.trianglepuzzle;

import java.io.IOException;
import java.util.List;

public class Triangle {
	private final List<List<TriangleNode>> triangleData;

	public Triangle(final List<List<TriangleNode>> triangleData) {
		this.triangleData = triangleData;
	}

	public Triangle(final String fileFromClasspath) throws IOException {
		this.triangleData = new TriangleDataLoader().load(fileFromClasspath);
	}

	public long calculateLargestSum() {
		return calculateLargestSum(0, 0);
	}

	private long calculateLargestSum(final int row, final int index) {
		final TriangleNode rootNode = triangleData.get(row).get(index);
		// check programmatic cache
		if (rootNode.isCalculated()) {
			return rootNode.getSum();
		}
		long largestChildSum = 0;
		if (row + 1 < triangleData.size()) {
			largestChildSum = Math.max(calculateLargestSum(row + 1, index),
					calculateLargestSum(row + 1, index + 1));

		}
		long total = rootNode.getValue() + largestChildSum;
		// cache it
		rootNode.setSum(total);

		return total;
	}

}
