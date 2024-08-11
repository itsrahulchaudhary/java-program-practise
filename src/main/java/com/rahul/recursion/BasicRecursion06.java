package com.rahul.recursion;

public class BasicRecursion06 {
	// // Function to print numbers from N to 1 using backtracking
	// N = 4 -> 4, 3, 2, 1
	public static void main(String[] args) {
		int N = 4; // Example value for N
	//	printNumbers(N); // Start printing from N to 1
		printNumbers2(N,N);

	}

	public static void printNumbers(int current) {
		// Base case: stop if current number is less than 1
		if (current < 1) {
			return;
		}

		// Recursive call to print the next number (decrementing)
		printNumbers(current - 1);

		// Print the current number after returning from the recursive call
		System.out.println(current);
	}
	
	public static void printNumbers2(int current, int n) {
		// Base case: stop if current number is less than 1
		if (current < 1) {
			return;
		}

		// Recursive call to print the next number (decrementing)
		printNumbers2(current - 1, n);

		// Print the current number after returning from the recursive call
		System.out.println(current);
	}

}
