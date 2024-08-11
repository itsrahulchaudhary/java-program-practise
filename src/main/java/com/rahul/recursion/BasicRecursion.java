package com.rahul.recursion;

public class BasicRecursion {
	static int count = 0;

	public static void main(String[] args) {
		System.out.println(recFun());
	}

	public static int recFun() {
		if (count == 7) {
			return count;
		}
		print(count);
		count++;
		return recFun();
	}

	public static int print(int count) {
		System.out.println(count);
		return count;
	}
}
