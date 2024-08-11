package com.rahul.recursion;

public class BasicRecursion03 {
	// Print Linearly 1 to N
	// N = 4 , 1,2,3,4
	public static void main(String[] args) {
		recFunc(1, 4);

	}

	public static int recFunc(int i, int n) {
		if (i > n) {
			return n;
		}
		print(i);
		i++;
		return recFunc(i, n);
	}

	public static void print(int i) {
		System.out.println(i);
	}

}
