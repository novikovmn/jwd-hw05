package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами */

public class Task05 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 7, 8 }, { 4 } };

		/*
		 * находим макс длину среди строк
		 */
		int maxLength = arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length > maxLength) {
				maxLength = arr[i].length;
			}
		}

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("=============================");

		for (int i = 0; i < arr.length; i += 2) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.printf("[%d] ", arr[i][j]);

				if (j == arr[i].length - 1 && j < maxLength - 1) {
					for (int k = 0; k < maxLength - 1 - j; k++) {
						System.out.print("[ ] ");
					}
				}

			}
			System.out.println();
		}

	}

}
