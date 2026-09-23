package com.pbo.week1.assign1.Driver;

import java.util.Scanner;

import com.pbo.week1.assign1.GradeCalculation;
import com.pbo.week1.assign1.MilesToKilometers;
import com.pbo.week1.assign1.LitersToGallons;
import com.pbo.week1.assign1.CadToUsd;

public class DriverMain {

	public static void main(String[] args) {

		GradeCalculation gc = new GradeCalculation();

		System.out.println("Enter the choice for operation  1.-GradeCalculation, 2-MilesToKms, 3-LitersToGallons, 4-CADtoUSD  ");
		try (Scanner sc = new Scanner(System.in)) {
			int choice = sc.nextInt();

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