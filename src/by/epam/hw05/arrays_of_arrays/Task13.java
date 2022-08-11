package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */

public class Task13 {

	public static void main(String[] args) {

		int n = 6;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i % 2 == 0) {
					arr[i][j] = j + 1;
				} else {
					arr[i][j] = n - j;
				}

			}
		}

		System.out.println("Итог: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
