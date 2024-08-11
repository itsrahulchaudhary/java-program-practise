package com.rahul.recursion;

public class BasicRecursion02 {
	// Print Name N times using Recursion
	public static void main(String[] args) {
		recFunc(1, 13);

	}

	public static int recFunc(int i, int n) {
		if (i > n) {
			return n;
		}
		print();
		i++;
		return recFunc(i, n);
	}

	public static void print() {
		System.out.println("rahul");
	}

}
