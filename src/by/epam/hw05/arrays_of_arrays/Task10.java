package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 
10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы. 
*/

public class Task10 {

	public static void main(String[] args) {

		int k = 1; // строка
		int p = 2; // столбец

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Дано: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("=================");

		System.out.printf("Выводим %d-ю строку:\n", k);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == k) {
					System.out.printf("[%d] ", arr[i][j]);
				}
			}
		}

		System.out.println();
		System.out.println("=================");

		System.out.printf("Выводим %d-й солбец:\n", p);
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (j == p) {
					System.out.printf("[%d]\n", arr[i][j]);
				}
			}
		}

	}

}
