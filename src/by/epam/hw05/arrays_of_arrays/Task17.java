package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

public class Task17 {

	public static void main(String[] args) {

		int n = 6;

		int[][] arr = new int[n][n];

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("================================");

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {

				if (j == 0 || j == n - 1) {
					arr[i][j] = 1;
				} else {
					arr[0][j] = 1;
					arr[n - 1][j] = 1;
				}

			}
		}

		System.out.println("Итог: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
