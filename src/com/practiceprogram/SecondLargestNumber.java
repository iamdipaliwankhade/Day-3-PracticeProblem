package com.practiceprogram;

/**
 * 
 * @author Dipali
 *
 */
public class SecondLargestNumber { 

	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 5, 9, 3, 8 };
		int b[] = { 33, 67, 94, 93, 76, 52 };
		System.out.println("Second Largest:" + getSecondLargest(a, 6));
		System.out.println("Second Largest:" + getSecondLargest(b, 6));

	}

}
