package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное) */

public class Task18 {

	public static void main(String[] args) {

		int n = 6;

		int[][] arr = new int[n][n];

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("================================");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = n - n + i + 1;
			}
		}

		System.out.println("Итог: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
