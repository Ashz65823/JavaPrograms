package com.zensar.training.bean;

import java.util.Arrays;

public class NumberProcessing {

	private int[] array;
	private int currentIndex = 0;

	public NumberProcessing(int n) {
		this.array = new int[n];// -->constructor
	}

	public void add(int numberdata)// String data and moving to next position
	{
		this.array[this.currentIndex] = numberdata;
		this.currentIndex++;
	}

	public int getMaximun() {
		int max = 0;
		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	public int getMinimun() {
		int min = array[0];
		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	public int getSum() {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;

	}

	@Override
	public String toString() {
		return Arrays.toString(this.array);
	}

}
