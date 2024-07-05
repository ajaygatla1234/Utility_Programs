package com.gl;

public class PrimeNumbers {
	
	public static boolean isPrime1(int num) {
		
		 if (num <= 1) {
	            return false; // 1 and numbers less than 1 are not prime numbers
	        }
		
		for(int i=2;i<=Math.sqrt(num);i++) {  //If you start the loop with i = 1 without adding an extra condition, the code will incorrectly identify all numbers as not prime, because every number is divisible by 1.
			if(num%i==0) {
				return false;
			}	
		}
		return true;
	}

	public static void isPrime2(int num){
    		if (num <= 1) {
      		 	 System.out.println("Not a prime");
        		return; // Exit the method early
    		}

   		 boolean isPrime = true;

   		 for (int i = 2; i <= Math.sqrt(num); i++) {
    		    if (num % i == 0) {
       		     isPrime = false; // If divisible by any number, it's not prime
           	     break;
       		 }
    }

    if (isPrime) {
        System.out.println("It's a prime number");
    } else {
        System.out.println("Not a prime");
    }
}

		
	
	public static void main(String[] args) {
				
		if(!isPrime(1)) {
			System.out.println("Not a prime");
		}
		else{
			System.out.println("Its a prime Number");
		}
	}

}

/*
Why Check Up to the Square Root?
To determine if a number num is prime, we need to check if it has any divisors other than 1 and itself. A divisor is a number that divides num without leaving a remainder.

Key Insight:
If num can be factored into two factors a and b (i.e., num = a * b), then one of these factors must be less than or equal to the square root of num. This is because if both factors were greater than the square root of num, their product would be greater than num, which contradicts the definition of a and b as factors of num.

Example:
Consider num = 36:

Factors of 36 are (1, 36), (2, 18), (3, 12), (4, 9), (6, 6).
The square root of 36 is 6.
Factors less than or equal to 6 are: 1, 2, 3, 4, 6.
Factors greater than 6 are: 9, 12, 18, 36.
So, if there is any factor pair (a, b) where a * b = num, one of a or b must be less than or equal to the square root of num.

Efficiency:
By checking up to the square root of num, we reduce the number of iterations required to determine if num has any divisors, significantly improving the efficiency of the algorithm.
*/
