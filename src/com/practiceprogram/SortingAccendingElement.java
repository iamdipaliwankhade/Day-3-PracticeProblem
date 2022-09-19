package com.practiceprogram;

/**
 * 
 * @author Dipali
 *
 */
public class SortingAccendingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialise array
		int[] arr = new int[] { 5, 2, 6, 9, 4 };
		int temp = 0;

		// Displyaing elements of original array
		System.out.println("Element of original array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		// Sort the array in accending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("");

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}

}
