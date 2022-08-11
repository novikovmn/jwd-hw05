package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

public class Task12 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int[][] arr = new int[n][n];
		
		System.out.println("Дано:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("====================================");
		
		for (int i = 0; i < n; i++) {
			arr[i][i] = i;
		}
		
		System.out.println("Итог:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
