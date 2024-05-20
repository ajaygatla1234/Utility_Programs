package com.gl1;

import java.util.Scanner;

public class SumOfDigits {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the Number");
	        int number = scanner.nextInt();
	        int sum = 0;
	     
	        while(number>0){
	            int a=number%10;
	            sum=sum+a;
	            number=number/10;

	        }
	        System.out.println(sum);
	        scanner.close();
	    }

}
