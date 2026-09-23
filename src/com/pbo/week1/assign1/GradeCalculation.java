/*
 * Author: Pedro Bilhalva Oliveira
 * Date: September 23, 2026
 * Description: Task A - Reads the marks of 6 subjects and calculates
 *              the student's final grade (A, B, C, D or F).
 */

package com.pbo.week1.assign1;

import java.util.Scanner;

/**
 * Task A: Calculates the grade of a student based on the marks of 6 subjects.
 */
public class GradeCalculation {

	/**
	 * Prompts the user for the marks of 6 subjects, calculates the average
	 * and prints the corresponding letter grade.
	 */
	public void GradeCalc() {

		// Array storing the marks of the 6 subjects
		int marks[] = new int[6];
		int i;
		float total = 0, avg; // total sum of marks and computed average

		try (Scanner scanner = new Scanner(System.in)) {
			// Loop that reads the marks of each subject and sums them up
			for (i = 0; i < 6; i++) {

				System.out.print("Enter Marks of Subject" + (i + 1) + ":");
				marks[i] = scanner.nextInt();
				total = total + marks[i];
			}
		}

		// Calculating the average of the 6 marks
		avg = total / 6;

		// Deciding the letter grade based on the average (adjust thresholds
		// as per your course outline)
		System.out.print("The student Grade is: ");
		if (avg >= 90) {
			System.out.print("A");
		} else if (avg >= 80 && avg < 90) {
			System.out.print("B");
		}
		//..  complete this... as outline ... specification..

		else if (avg >= 40 && avg < 60) {
			System.out.print("C");
		}

		// Marks below the ranges above get D
		else {
			System.out.print("D");
		}
	}

}