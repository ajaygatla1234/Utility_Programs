package com.gl;

import java.util.Scanner;

public class LeapYear {
	
	public static void isLeapYear(int year) {
		if(year%400==0||(year%4==0&&year%100!=0)) {
			System.out.println(year+" is a Leap year");
		}
		else {
			System.out.println(year+" is not a Leap year");
		}
	}

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year=scanner.nextInt();
		
		isLeapYear(year);
		scanner.close();
	}
}


//Conditions
//1. If a year is divisible by 400, it is a leap year.
//2. If a year is divisible by 100 and not divisible by 400, it is not a leap year.
//3. If a year is divisible by 4 and not divisible by 100, it is a leap year.


/*
Certainly! Let's break down the logic of the condition step by step:

1. year % 400 == 0: This part of the condition checks if the year is divisible evenly by 400. According to the leap year rules, if a year is divisible by 400, it is a leap year regardless of other conditions. So, if this condition is true, the year is considered a leap year.

2. year % 4 == 0 && year % 100 != 0: If the year is not divisible by 400, this part of the condition checks two sub-conditions:

	a. year % 4 == 0: It checks if the year is divisible evenly by 4. This sub-condition ensures that the year is a multiple of 4, which is one of the conditions for a leap year.
	b. year % 100 != 0: It checks if the year is not divisible evenly by 100. This sub-condition ensures that the year is not a multiple of 100, which is another condition for a leap year. If a year is divisible by 100 but not by 400, it is not a leap year.

If either of the conditions (1 or 2) is true, the year is considered a leap year. Here's how the conditions work together:

	a. If the year is divisible by 400, it satisfies condition 1, and the year is considered a leap year.
	b. If the year is not divisible by 400 but is divisible by 4 and not by 100, it satisfies condition 2, and the year is considered a leap year.
	c. If none of the conditions are met, the year is not a leap year.
This logic correctly follows the rules for determining leap years and ensures that only years meeting the specified conditions are classified as leap years. 
*/
