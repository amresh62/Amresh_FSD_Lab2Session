package com.gl.services;

public class MergeSortCurrency {

	public static void mergeSortDescending(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int mid = arr.length / 2;
		int[] leftHalf = new int[mid];
		int[] rightHalf = new int[arr.length - mid];
		for (int i = 0; i < mid; i++) {
			leftHalf[i] = arr[i];
		}
		for (int i = mid; i < arr.length; i++) {
			rightHalf[i - mid] = arr[i];
		}
		mergeSortDescending(leftHalf);
		mergeSortDescending(rightHalf);
		mergeDescending(arr, leftHalf, rightHalf);
	}

	public static void mergeDescending(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] >= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}
}
