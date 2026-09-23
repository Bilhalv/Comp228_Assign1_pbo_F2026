package com.pbo.week1.assign1;

import java.util.Scanner;

public class LitersToGallons {

	public void convertLitersToGallons() {

		try (Scanner scanner = new Scanner(System.in)) {
			double liters = readPositiveNumber(scanner, "Enter volume in liters: ");

			double gallons = liters * 0.264172;

			System.out.printf("%.2f liters = %.2f gallons%n", liters, gallons);
		}
	}

	private double readPositiveNumber(Scanner scanner, String prompt) {

		double value = 0;
		boolean valid = false;

		while (!valid) {
			System.out.print(prompt);
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