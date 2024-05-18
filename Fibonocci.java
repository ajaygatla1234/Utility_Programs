package com.gl.programms;

public class Fibonocci {


	public static int fibonacciRecursion(int num) {

		if(num==0) {
			return 0;
		}
		if(num==1) {
			return 1;
		}

		return fibonacciRecursion(num-1)+fibonacciRecursion(num-2);
	}

	public static void fibonacciIteration() {

		int num1=0;
		int num2=1;
		int count=10;
		System.out.print(num1+" ");
		System.out.print(num2+" ");

		for(int i=0;i<count-2;i++) {
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;

		for (int i = 2; i < n; i++) {
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib;
	}

	public static void main(String[] args) {

		int count=10;

		System.out.println("Using Recursion");
		for(int i=0;i<count;i++) {
			System.out.print(fibonacciRecursion(i)+" ");
		}
		System.out.println("\n\nUsing Iteration 1");
		fibonacciIteration();

		int n = 10; // Number of terms in the Fibonacci series
		System.out.println("\n\nFibonacci series up to " + n + " terms:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
