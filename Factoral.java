package com.gl;

public class Factoral {

	public static void factorialIteration(int num) {
		if (num < 0) {
			System.out.println("Factorial is not defined for negative numbers");
			return;
		} else {
			int factorial = 1;
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}
			System.out.println("Factorial (Iteration) of " + num + " is: " + factorial);
		}
	}

	public static int factorialRecursion(int i) {
		if (i < 0) {
			return 0; // Returning 0 to indicate invalid input
		}
		if (i == 0) {
			return 1;
		}
		return i * factorialRecursion(i - 1);
	}

	public static void main(String[] args) {
		// Testing with a positive number
		factorialIteration(5);
		int result = factorialRecursion(5);
		System.out.println("Factorial (Recursion) of 5 is: " + result);

		// Testing with a negative number
		factorialIteration(-5);
		result = factorialRecursion(-5);
		if (result != 0) {
			System.out.println("Factorial (Recursion) of -5 is: " + result);
		} else {
			System.out.println("Factorial is not defined for negative numbers");
		}
	}
}
