package com.bridgelabz.Empwage;

/**
 * 
 * @author HITESH
 *
 */
public class MultipleCompany {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * initializing values for different companies
		 * calculating their wages
		 */
		System.out.println("Welcome to Employee Wage Problem ");
		System.out.println("Reliance Employee Data ");
		EmployeeWage Reliance = new EmployeeWage();
		Reliance.Emp(20, 8, 4, 20, 100);

		System.out.println("\n Flipkart Employee Data ");
		EmployeeWage Flipkart = new EmployeeWage();
		Flipkart.Emp(25, 10, 5, 28, 140);

		System.out.println("\n Amazon Employee Data ");
		EmployeeWage Amazon = new EmployeeWage();
		Amazon.Emp(28, 12, 6, 25, 180);
	}
}