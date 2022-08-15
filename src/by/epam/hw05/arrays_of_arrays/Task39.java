package by.epam.hw05.arrays_of_arrays;

/* 39. Найдите произведение двух матриц. 
 */

import java.util.Arrays;

public class Task39 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] c = new int[a.length][a.length];

		System.out.println("1-й массив: ");
		printArray(a);

		System.out.println("2-й массив: ");
		printArray(b);

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}

		System.out.println("Произведение: ");
		printArray(c);

	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("========================");
	}

}
