package com.pbo.week1.assign1;

import java.util.Scanner;

public class MilesToKilometers {

	public void convertMilesToKm() {

		try (Scanner scanner = new Scanner(System.in)) {
			double miles = readPositiveNumber(scanner);

			double km = miles * 1.609344;

			System.out.printf("%.2f miles = %.2f kilometers%n", miles, km);
		}
	}

	private double readPositiveNumber(Scanner scanner) {

		double value = 0;
		boolean valid = false;

		while (!valid) {
			System.out.print("Enter distance in miles: ");
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