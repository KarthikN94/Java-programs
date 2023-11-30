package com.practice;

public class PrintEvenSumFrom1to90 {

	// Print Even Sum From 1 to 90

	public static void main(String[] args) {
		int a = 90;
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (i % 2 == 0) {
				sum = sum + i;

			}

		}
		System.out.println(sum);

	}

}
