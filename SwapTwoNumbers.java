package com.gl;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void usingThirdVariable(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("\na="+a);
		System.out.println("b="+b);
	}
	
	public static void usingArithmeticOperators(int a, int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\na="+a);
		System.out.println("b="+b);
	}

	public static void usingXOR_BitwiseOperator(int a, int b) {
		
	        // Swap using XOR
	        a = a ^ b; // Step 1
	        b = a ^ b; // Step 2
	        a = a ^ b; // Step 3
	
	        // Print swapped values
	        System.out.println("Swapped values: a = " + a + ", b = " + b);

		// Example Execution:
		// For a = 5 and b = 10:
		
		// Step 1: a = a ^ b = 5 ^ 10 = 15 (in binary: 0101 ^ 1010 = 1111)
		// Step 2: b = a ^ b = 15 ^ 10 = 5 (in binary: 1111 ^ 1010 = 0101)
		// Step 3: a = a ^ b = 15 ^ 5 = 10 (in binary: 1111 ^ 0101 = 1010)
		// After these operations, a becomes 10 and b becomes 5, effectively swapping the values without using a third variable or the addition operator.
  	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value a= ");
		int a=scanner.nextInt();
		
		System.out.print("Enter value b= ");
		int b=scanner.nextInt();
		
		usingThirdVariable(a, b);
		withoutThirdVariable(a, b);
		usingXOR_BitwiseOperator(a,b);
		
		scanner.close();
	}
}
