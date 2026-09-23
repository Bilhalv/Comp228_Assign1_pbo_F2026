/*
 * Author: Pedro Bilhalva Oliveira
 * Date: September 23, 2026
 * Description: Task B - Converts a distance given in miles to kilometers.
 */

package com.pbo.week1.assign1;

import java.util.Scanner;

/**
 * Task B: Converts a distance in miles to kilometers.
 * 1 mile = 1.609344 kilometers.
 */
public class MilesToKilometers {

	/**
	 * Reads a distance in miles from the user, converts it to kilometers
	 * and prints the result.
	 */
	public void convertMilesToKm() {

		try (Scanner scanner = new Scanner(System.in)) {
			// Ask the user for the distance in miles (validated input)
			double miles = readPositiveNumber(scanner);

			// Convert miles to kilometers using the conversion factor
			double km = miles * 1.609344;

			// Display the result rounded to 2 decimal places
			System.out.printf("%.2f miles = %.2f kilometers%n", miles, km);
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
			System.out.print("Enter distance in miles: ");
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