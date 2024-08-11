package com.rahul.array;

public class A01MaximumNo {
	public static void main(String[] args) {
		int arr[] = { 12, 45, 22, 67, 32, 44 };
		max(arr);
	}

	public static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max :: " + max);
	}
}
