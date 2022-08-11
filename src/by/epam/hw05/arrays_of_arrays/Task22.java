package by.epam.hw05.arrays_of_arrays;

/* 22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

import java.util.Arrays;

public class Task22 {

	public static void main(String[] args) {

		int n = 4;

		int[][] arr = new int[n][n];

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("================================");

		for (int j = 0; j < n; j++) {

			int elem = (n - (n - 1)) + j;
			for (int i = 0; i < n - j; i++) {
				arr[i][j] = elem++;
			}

		}

		System.out.println("Итог: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
