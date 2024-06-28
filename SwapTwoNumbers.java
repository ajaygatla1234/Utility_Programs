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
