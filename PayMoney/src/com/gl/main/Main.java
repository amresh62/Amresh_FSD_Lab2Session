package com.gl.main;

import java.util.Scanner;

import com.gl.services.TransactionServices;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter the Number of Transactions");
			int trnSize = sc.nextInt();
			int[] transaction = new int[trnSize];
			for (int i = 0; i < trnSize; i++) {
				System.out.println("Enter the values of Transaction No.  " + (i + 1));
				transaction[i] = sc.nextInt();
			}
			System.out.println("Please enter the total no of targets that needs to be achieved");
			int targetNo = sc.nextInt();
			if (targetNo > transaction.length) {
				System.out.println(
						"No. of Target must not be greater than the No. of Transactions, Exiting the application !");
				return;
			}
			System.out.println("Please Enter the value of target");
			int target = sc.nextInt();
			TransactionServices trn = new TransactionServices();
			trn.CheckTransaction(transaction, targetNo, target);

		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
