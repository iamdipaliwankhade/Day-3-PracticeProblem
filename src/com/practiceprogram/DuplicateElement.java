package com.practiceprogram;

/**
 * 
 * @author Dipali
 *
 */
public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 9, 2, 6, 3, 8, 8 };
		System.out.println("Duplicate element in given array:");

		// searches for duplicate element

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j])

					System.out.println(arr[j]);
			}
		}

	}

}
