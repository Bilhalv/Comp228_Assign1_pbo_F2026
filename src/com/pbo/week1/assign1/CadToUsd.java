/*
 * Author: Pedro Bilhalva Oliveira
 * Date: September 23, 2026
 * Description: Task D - Converts an amount in Canadian Dollars (CAD)
 *              to US Dollars (USD) using the current exchange rate.
 */

package com.pbo.week1.assign1;

import java.util.Scanner;

/**
 * Task D: Converts an amount in CAD to USD.
 */
public class CadToUsd {

	// Current CAD to USD exchange rate (1 CAD = 0.71 USD).
	// Update this value to match today's exchange rate.
	public static final double EXCHANGE_RATE = 0.71;

	/**
	 * Reads an amount in CAD from the user, converts it to USD
	 * and prints the result.
	 */
	public void convertCadToUsd() {

		try (Scanner scanner = new Scanner(System.in)) {
			// Ask the user for the amount in CAD (validated input)
			double cad = readPositiveNumber(scanner);

			// Convert CAD to USD by multiplying by the exchange rate
			double usd = cad * EXCHANGE_RATE;

			// Display the result rounded to 2 decimal places
			System.out.printf("%.2f CAD = %.2f USD%n", cad, usd);
		}
	}

	/**
	 * Reads a non-negative number from the user. Keeps asking until a valid
	 * number is entered and handles non-numeric input without crashing.
	 */
	private double readPositiveNumber(Scanner scanner) {

		double value = 0;
		boolean valid = false;

		while (!valid) {
			System.out.print("Enter amount in CAD: ");
			try {
				value = scanner.nextDouble();
				if (value >= 0) {
					valid = true; // acceptable input, exit the loop
				} else {
					System.out.println("Invalid input. Please enter a non-negative number.");
				}
			} catch (java.util.InputMismatchException e) {
				// Input was not a number; clear the bad token and try again
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next();
			}
		}
		return value;
	}
}