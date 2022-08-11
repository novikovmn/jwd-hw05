package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
*/

public class Task14 {

	public static void main(String[] args) {

		int n = 4;

		int[][] arr = new int[n][n];

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		for (int i = 0; i < n; i++) {
			arr[i][n - 1 - i] = i + 1;
		}

		System.out.println("=====================");

		System.out.println("Итог: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
