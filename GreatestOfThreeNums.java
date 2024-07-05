package com;

import java.util.Scanner;

public class GreatestOfThreeNums {


	public static void main(String[] args) {

		int a=1,b=5,c=3;
		
		int i=a>b?a:b;
		
		int j=i>c?i:c;
		
		System.out.println(j);
	}

	public static void main(String[] args) {

		int a=1,b=5,c=3;

		int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  

		System.out.println(j);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Taking input for three numbers
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		System.out.print("Enter the third number: ");
		int num3 = scanner.nextInt();

		// Finding the greatest number
		int greatest = 0;

		if (num1 == num2 && num1 == num3) {
			System.out.println("All three numbers are equal.");
		}
		else {
			if (num1 >= num2 && num1 >= num3) {
				greatest = num1;
			} else if (num2 >= num1 && num2 >= num3) {
				greatest = num2;
			} else {
				greatest = num3;
			}

			// Printing the greatest number
			System.out.println("The greatest number is: " + greatest);
		}
		scanner.close();
	}
}
