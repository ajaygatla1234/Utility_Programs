package com.gl;

public class Palindrome {
	
	public static boolean ispalindromeString(String i) {
		int left=0;
		int right=i.length()-1;
		
		while(left<right) {
			if(i.charAt(left)!=i.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean ispalindromeString(int j) { //converting Integer to string and comparing
		String i=j+"";
		int left=0;
		int right=i.length()-1;
		
		while(left<right) {
			if(i.charAt(left)!=i.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean isPalindromeNumber(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
	
	public static void main(String[] args) {
		
		boolean b1=ispalindromeString("sos");
		boolean b2=ispalindromeString(101);
		boolean b3=isPalindromeNumber(101);
		
		if(b1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		if(b2) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		if(b3) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
}
