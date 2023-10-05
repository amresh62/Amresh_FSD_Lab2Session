package com.gl.services;

public class TenderServices {

	public static void Tender(int[] currencyArr, int amount) {
		MergeSortCurrency.mergeSortDescending(currencyArr);
		ArrangeNotes.notesCount(currencyArr, amount);
	}

}
