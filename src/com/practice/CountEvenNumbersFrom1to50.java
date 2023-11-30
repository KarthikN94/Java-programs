package com.practice;

public class CountEvenNumbersFrom1to50 {

	// Count Even Numbers from 1 to 50

	public static void main(String[] args) {
		int num = 50;
		int count = 0;
		for (int i = 1; i <=num; i++) {
			if (i % 2 == 0) {
				count++;

			}

		}
		System.out.println(count);
	}

}
