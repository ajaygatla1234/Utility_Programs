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
	
	public static void withoutThirdVariable(int a, int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\na="+a);
		System.out.println("b="+b);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value a= ");
		int a=scanner.nextInt();
		
		System.out.print("Enter value b= ");
		int b=scanner.nextInt();
		
		usingThirdVariable(a, b);
		withoutThirdVariable(a, b);
		
		scanner.close();
	}
}
