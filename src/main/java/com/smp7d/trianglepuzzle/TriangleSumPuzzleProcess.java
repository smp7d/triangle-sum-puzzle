package com.smp7d.trianglepuzzle;

import java.io.IOException;

public class TriangleSumPuzzleProcess {

	public static void main(String[] args) throws IOException {
		System.out.println(new Triangle("triangle.txt")
				.calculateLargestSum());
	}
}
