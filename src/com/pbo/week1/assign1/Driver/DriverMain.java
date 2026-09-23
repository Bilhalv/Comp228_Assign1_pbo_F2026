/*
 * Author: Pedro Bilhalva Oliveira
 * Date: September 23, 2026
 * Description: Driver / menu of the assignment. Shows the options for
 *              tasks A-D, reads the user's choice and calls the
 *              corresponding conversion or calculation method.
 */

package com.pbo.week1.assign1.Driver;

import java.util.Scanner;

import com.pbo.week1.assign1.GradeCalculation;
import com.pbo.week1.assign1.MilesToKilometers;
import com.pbo.week1.assign1.LitersToGallons;
import com.pbo.week1.assign1.CadToUsd;

/**
 * Driver program: presents a menu and runs the selected task (A-D).
 */
public class DriverMain {

	public static void main(String[] args) {

		// Object created for Task A (grade calculation)
		GradeCalculation gc = new GradeCalculation();

		// Show the menu options to the user
		System.out.println("Enter the choice for operation  1.-GradeCalculation, 2-MilesToKms, 3-LitersToGallons, 4-CADtoUSD  ");
		try (Scanner sc = new Scanner(System.in)) {
			// Read the user's choice
			int choice = sc.nextInt();

			// Run the task selected by the user
			switch (choice) {
			case 1:
				System.out.println("Doing Grade Calculation.. ");
				gc.GradeCalc();
				break;
			case 2:
				System.out.println("Doing Conversion from Miles to Kilometers...");
				MilesToKilometers mtk = new MilesToKilometers();
				mtk.convertMilesToKm();
				break;
			case 3:
				System.out.println("Doing Conversion from Liters to Gallons...");
				LitersToGallons ltg = new LitersToGallons();
				ltg.convertLitersToGallons();
				break;
			case 4:
				System.out.println("Doing Conversion from CAD to USD...");
				CadToUsd ctu = new CadToUsd();
				ctu.convertCadToUsd();
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
				break;
			}
		}
	}

}