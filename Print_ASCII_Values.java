package com.gl1;

import java.util.Scanner;

public class Print_ASCII_Values {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void integerToChar() {
		System.out.println("Enter the Number");
		int i=scanner.nextInt();
		char ch=(char)i;
		System.out.println(ch);
		
		/*
		 * char ch=67  is possible 
		 * but 
		 * char ch = scanner.nextInt(); is not possible, because
		 * 
		 * An int has larger capacity than a char , so the conversion is not guaranteed to work. 
		 * The possible range in the value of a char is 0 to 65535, but an int can be anywhere from -2147483648	 to 2147483647.
		 * So we need to type cast it
		 * 
		 * Ex: upto char ch1=65536; is possible
		 * 	   from	char ch1=65537; is not possible (compilation Error)
		*/
	}
	
	public static void charToInteger() {
		System.out.println("Enter the Character");
		String str=scanner.next();
		
		if(str.length()==1) {
			char ch=str.charAt(0);
			int i=ch;
			System.out.println(i);
		}
		else {
			System.out.println("Enter only One Character");
		}
	}
	
	public static void main(String[] args) {
		
		integerToChar();
		charToInteger();
		
		
	}
}
