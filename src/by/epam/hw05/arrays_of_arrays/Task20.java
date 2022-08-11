package by.epam.hw05.arrays_of_arrays;

/* 20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 */

import java.util.Arrays;

public class Task20 {

	public static void main(String[] args) {

		int n = 6;

		int[][] arr = new int[n][n];

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("================================");

		for (int j = 0; j < n; j++) {
			for (int i = j; i < n - j; i++) {

				arr[i][j] = 1;
				arr[n - i - 1][n - j - 1] = 1;

			}
		}

		System.out.println("Итог: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
