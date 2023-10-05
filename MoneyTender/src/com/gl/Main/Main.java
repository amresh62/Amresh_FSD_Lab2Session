package com.gl.Main;

import java.util.Scanner;

import com.gl.services.TenderServices;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Please Enter the No. of Currency Denominations");
			int curSize = sc.nextInt();
			int[] currencyArr = new int[curSize];
			System.out.println("Please Enter the Currency Denominations");
			for (int i = 0; i < curSize; i++) {
				currencyArr[i] = sc.nextInt();
			}
			System.out.println("Please Enter the Amount you want to Pay");
			int amount = sc.nextInt();
			TenderServices.Tender(currencyArr, amount);
		}

	}

}
