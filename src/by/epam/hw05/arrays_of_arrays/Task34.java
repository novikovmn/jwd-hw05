package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

/* 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число 
единиц равно номеру столбца. 
 */

public class Task34 {

	public static void main(String[] args) {

		/* размерность от 2 до 10 */
		int m = new Random().nextInt(9) + 2;
		int n = new Random().nextInt(9) + 2;

		int[][] arr = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("======================================");

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {

				if (i < j) {
					arr[i][j] = 1;
				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
