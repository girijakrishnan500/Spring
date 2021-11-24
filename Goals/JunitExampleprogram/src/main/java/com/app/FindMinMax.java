package com.app;

public class FindMinMax {

	public static int findMax(int arr[]) {
		int max = 0;
		// int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public static int numberCube(int i) {
		return i * i * i;
	}

}
