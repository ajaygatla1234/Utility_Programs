package com.gl1;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void reverseInteger1(int i) {
		int revesedNum=0;
		
		while(i>0) {
			int j=i%10;
			revesedNum=j;
			i=i/10;
			System.out.print(revesedNum+"");
		}
	}
	
	 public static int reverseInteger2(int num) {
	        int reversed = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        return reversed;
	    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int i=scanner.nextInt();
		
		reverseInteger1(i);
		System.out.println("\n"+reverseInteger2(i));
		
		scanner.close();
	}
}
