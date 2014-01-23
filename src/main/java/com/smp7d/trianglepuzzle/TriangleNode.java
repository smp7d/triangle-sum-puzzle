package com.smp7d.trianglepuzzle;

public class TriangleNode {
	private final int value;
	private boolean calculated;
	private long sum;
	
	public TriangleNode(final int value){
		this.value = value;
	}
	
	public long getSum() {
		return sum;
	}

	public void setSum(final long sum) {
		calculated = true;
		this.sum = sum;
	}

	public boolean isCalculated() {
		return calculated;
	}

	public int getValue() {
		return value;
	}
	
}
