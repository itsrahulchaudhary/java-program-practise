package com.rahul.recursion;

public class BasicRecursion04 {
	// Print  from N to 1 
	// N = 4 -> 4, 3, 2, 1
	public static void main(String[] args) {
		recFunc(4, 4);

	}

	public static int recFunc(int i, int n) {
		if (i < 1) {
			return 1;
		}
		print(i);
		i--;
		return recFunc(i, n);
	}

	public static void print(int i) {
		System.out.println(i);
	}

}
