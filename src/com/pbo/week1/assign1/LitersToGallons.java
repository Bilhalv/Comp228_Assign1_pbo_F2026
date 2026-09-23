/*
 * Author: Pedro Bilhalva Oliveira
 * Date: September 23, 2026
 * Description: Task C - Converts a volume given in liters to gallons.
 */

package com.pbo.week1.assign1;

import java.util.Scanner;

/**
 * Task C: Converts a volume in liters to gallons.
 * 1 liter = 0.264172 gallons.
 */
public class LitersToGallons {

	/**
	 * Reads a volume in liters from the user, converts it to gallons
	 * and prints the result.
	 */
	public void convertLitersToGallons() {

		try (Scanner scanner = new Scanner(System.in)) {
			// Ask the user for the volume in liters (validated input)
			double liters = readPositiveNumber(scanner, "Enter volume in liters: ");

			// Convert liters to gallons using the conversion factor
			double gallons = liters * 0.264172;

			// Display the result rounded to 2 decimal places
			System.out.printf("%.2f liters = %.2f gallons%n", liters, gallons);
		}
	}

	/**
	 * Reads a non-negative number from the user. Keeps asking until a valid
	 * number is entered and handles non-numeric input without crashing.
	 *
	 * @param prompt message shown to the user before reading the input
	 */
	private double readPositiveNumber(Scanner scanner, String prompt) {

		double value = 0;
		boolean valid = false;

		while (!valid) {
			System.out.print(prompt);
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