package com.va.week1.assign1.Driver;

import java.util.Scanner;

import com.va.week1.assign1.GradeCalculation;

public class DriverMain {

	public static void main(String[] args) {
		

	/*
	 * Create objects for classes of Task a-d.	
	 * 
	 * 
	 */
		
	// for example tasks grade calculation goes as below..
		GradeCalculation gc = new GradeCalculation();
// create objects for all the classes..  and then call the method using switch case.. 

	System.out.println("Enter the choice for operation  1.-Gradecacluation, 2-MilestoKms, ...  ");
	try (Scanner sc = new Scanner(System.in)) {
		int choice=sc.nextInt();
		
		
		    switch (choice) {
		      case 1:
		    	  	 System.out.println("Doing Grade Calculation.. ");
		      	gc.GradeCalc();
		        break;
		      case 2:
		        System.out.println("task b...");
		        // call using object.method to initialize the method...
		        break;
		        
		      
		    }
	}
		
		
		
	
		
	}

}
