package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 
19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task19 {

	public static void main(String[] args) {

		int n = 10;

		int[][] arr = new int[n][n];

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("================================");

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - i; j++) {

				arr[i][j] = 1;
				arr[n - 1 - i][j] = 1;

			}
		}

		System.out.println("Итог: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
