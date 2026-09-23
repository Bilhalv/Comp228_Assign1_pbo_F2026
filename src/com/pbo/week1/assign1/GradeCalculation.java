/*
 * Author: Pedro Bilhalva Oliveira
 * Date: September 23, 2026
 * Description: Task A - Reads the marks of this semester's 6 courses and
 *              calculates the student's final grade (A+ to F).
 */

package com.pbo.week1.assign1;

import java.util.Scanner;

/**
 * Task A: Calculates the grade of a student based on the marks of this
 * semester's 6 courses.
 */
public class GradeCalculation {

	// Courses enrolled in this semester
	private static final String[] COURSES = { "ENGL 253", "COMP 214", "GNED 500", "COMP 228", "COMP 246", "COMP 229" };

	/**
	 * Prompts the user for the marks of each course, calculates the average
	 * and prints the corresponding letter grade (A+ to F).
	 */
	public void GradeCalc() {

		// Array storing the marks of the 6 courses
		int[] marks = new int[COURSES.length];
		int i;
		float total = 0, avg; // total sum of marks and computed average

		try (Scanner scanner = new Scanner(System.in)) {
			// Loop that reads the marks of each course and sums them up
			for (i = 0; i < COURSES.length; i++) {

				System.out.print("Enter marks for " + COURSES[i] + ":");
				marks[i] = scanner.nextInt();
				total = total + marks[i];
			}
		}

		// Calculating the average of the 6 courses
		avg = total / COURSES.length;

		// Deciding the letter grade based on the average, per the grading scale:
		// A+ 90+, A 80+, B+ 75+, B 70+, C+ 65+, C 60+, D+ 55+, D 50+, F below 50
		System.out.print("The student Grade is: ");
		if (avg >= 90) {
			System.out.print("A+");
		} else if (avg >= 80) {
			System.out.print("A");
		} else if (avg >= 75) {
			System.out.print("B+");
		} else if (avg >= 70) {
			System.out.print("B");
		} else if (avg >= 65) {
			System.out.print("C+");
		} else if (avg >= 60) {
			System.out.print("C");
		} else if (avg >= 55) {
			System.out.print("D+");
		} else if (avg >= 50) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
	}

}