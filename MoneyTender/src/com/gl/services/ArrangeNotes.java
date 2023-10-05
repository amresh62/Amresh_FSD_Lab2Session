package com.gl.services;

public class ArrangeNotes {

	public static void notesCount(int[] currencyArr, int amount) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < currencyArr.length; i++) {
			int curCount = (amount / currencyArr[i]);
			if (curCount > 0)
				sb.append(currencyArr[i] + ":" + curCount + "\n");
			amount -= (currencyArr[i] * curCount);
			if (amount == 0) {
				break;
			}
		}
		if (amount != 0) {
			System.out.println("Exact amount cannot be given with the highest denomination");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be \n" + sb);
		}
	}
}
