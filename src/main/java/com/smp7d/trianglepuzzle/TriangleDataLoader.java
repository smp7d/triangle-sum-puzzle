package com.smp7d.trianglepuzzle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TriangleDataLoader {

	/**
	 * Pull the data out of the file and put it in a collection that can be
	 * used.
	 * 
	 * @param fileFromClasspath
	 *            the filename
	 * @return a list representing the triangle data
	 * @throws IOException
	 */
	public List<List<TriangleNode>> load(final String fileFromClasspath)
			throws IOException {
		final List<List<TriangleNode>> data = new ArrayList<List<TriangleNode>>();
		BufferedReader reader = null;
		InputStreamReader inputStreamReader = null;
		try {
			reader = new BufferedReader(
					inputStreamReader = new InputStreamReader(getClass()
							.getClassLoader().getResourceAsStream(
									fileFromClasspath)));
			String line;
			while ((line = reader.readLine()) != null) {
				data.add(parseLine(line));
			}
		} finally {
			inputStreamReader.close();
			reader.close();
		}
		return data;
	}

	private List<TriangleNode> parseLine(final String line) {
		final String[] numbers = line.split(" ");
		final List<TriangleNode> lineData = new ArrayList<TriangleNode>(
				numbers.length);
		for (String number : numbers) {
			lineData.add(new TriangleNode(Integer.parseInt(number)));
		}

		return lineData;
	}

}
