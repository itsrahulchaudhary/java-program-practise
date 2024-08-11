package com.rahul.array;

public class A03CheckArraySorted {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 9, 12};
		System.out.println(isSorted(arr));
	}

	public static boolean isSorted(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

}
