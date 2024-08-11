package com.rahul.array;

public class A02MinimumNo {
	public static void main(String[] args) {
		int arr[] = { 10, 32, 4, 56, 3, 98 };
		min(arr);
	}

	public static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min :: " + min);
	}
}
