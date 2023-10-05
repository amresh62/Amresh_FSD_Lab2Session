package com.gl.services;

public class TransactionServices {
	public void CheckTransaction(int[] transaction, int trnNo, int target) {
		int targetSum = 0;
		for (int i = 0; i < trnNo; i++) {
			targetSum += transaction[i];
			if (targetSum >= target) {
				System.out.println("Target achieved after " + (i + 1) + " transactions");
				return;
			}
		}
		System.out.println("Given Target not achieved");
	}
}
