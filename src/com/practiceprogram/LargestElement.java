package com.practiceprogram;
/**
 * 
 * @author Dipali
 *
 */
public class LargestElement {
	
      //Initialize array
	static int arr[] = { 10, 467, 78, 1993, 95 };

	// Method to find maximum in arr[]
	static int largest() {
		int i;

		// Initilize maximum element
		int max = arr[0];

		// Traverse arrray element from second and
		// compare every element with current max
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Largest in given array is " + largest());

	}

}
