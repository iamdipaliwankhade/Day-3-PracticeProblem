package com.practiceprogram;

/**
 * 
 * @author Dipal
 *
 */
public class SmallestElement {

	// Initilize array
	static int arr[] = { 10, 467, 78, 1993, 95 };

	// Method to find manimum in arr[]
	static int largest() {
		int i;

		// Initilize manimum element
		int min = arr[0];

		//Loop through the array
		for (i = 0; i < arr.length; i++)

			// compare element of array with min
			if (arr[i] < min)
				min = arr[i];
		return min;
	}

	public static void main(String[] args) {
		System.out.println("Smallest in given array is " + largest());

	}

}
