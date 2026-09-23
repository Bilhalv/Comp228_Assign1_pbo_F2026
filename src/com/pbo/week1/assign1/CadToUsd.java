package com.pbo.week1.assign1;

import java.util.Scanner;

public class CadToUsd {

	public static final double EXCHANGE_RATE = 0.71;

	public void convertCadToUsd() {
		
		try (Scanner scanner = new Scanner(System.in)) {
			double cad = readPositiveNumber(scanner);

			double usd = cad * EXCHANGE_RATE;

			System.out.printf("%.2f CAD = %.2f USD%n", cad, usd);
		}
	}

	private double readPositiveNumber(Scanner scanner) {

		double value = 0;
		boolean valid = false;

		while (!valid) {
			System.out.print("Enter amount in CAD: ");
			try {
				value = scanner.nextDouble();
				if (value >= 0) {
					valid = true;
				} else {
					System.out.println("Invalid input. Please enter a non-negative number.");
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next();
			}
		}
		return value;
	}
}