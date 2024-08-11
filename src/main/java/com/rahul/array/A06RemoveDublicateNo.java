package com.rahul.array;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class A06RemoveDublicateNo {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 2, 1, 7, 4, 1, 5 };
		int[] removeDublicate = removeDublicate2(arr);
		for (int res : removeDublicate) {
			System.out.println(res);
		}
	}

	public static int[] removeDublicate(int arr[]) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : arr) {
			set.add(num);
		}

		int result[] = new int[set.size()];
		int i = 0;
		for (int n : set) {
			result[i++] = n;
		}

		return result;
	}
	
	public static int[] removeDublicate2(int arr[]) {
		return IntStream.of(arr).distinct().toArray();
	}

}
