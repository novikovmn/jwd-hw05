package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 25. Получить квадратную матрицу порядка n */

public class Task25 {

	public static void main(String[] args) {

		int n = 3;

		int[][] arr = new int[n][n];

		int elem = n - (n - 1); // 1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = elem++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
