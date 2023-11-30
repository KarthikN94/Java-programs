package com.practice;

public class CountOddNumber1to100 {

	// print count Odd Number As 1 to 100

	public static void main(String[] args) {
		int num = 100;
		int count = 0;
		for (int i = 1; i <=num; i++) {
			if (i%2!=0) {
				count++;

			}

		}
		System.out.println(count);

	}

}
