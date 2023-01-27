package com.reverseString;

public class FindAMissingNumberFromASequence {
	
	/*
	 * First, we need to add all the sequence number, then we need to find how many
	 * numbers is missing, the we need to add all the sequence number with missing
	 * number too. Then we have to subtract between two number and print the number.
	 */
	public static void main(String[] args) {

		int seq[] = { 1, 2, 3, 4, 5,6, 8, 9, 10 };
		int sum = 0;
		System.out.println(seq.length);

		for (int i = 0; i < seq.length; i++) {
			sum = sum + seq[i];

		}
		System.out.println(sum);

		int sum2 = 0;
		for (int j = 0; j <= 10; j++) {
			sum2 = sum2 + j;

		}

		System.out.println(sum2);
		System.out.println(sum2 - sum);

	}

}
