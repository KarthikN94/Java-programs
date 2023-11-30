package com.practice;

public class PrintOddSumFrom1to80 {

	// Print Odd Sum From 1 TO 80

	public static void main(String[] args) {
		int a = 80;
		int sum = 0;
		for (int i = 0; i < a; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
	}

}
