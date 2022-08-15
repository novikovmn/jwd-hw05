package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 24. Дан линейный массив  x1, x2 ... xn−1, xn . Получить действительную квадратную матрицу порядка n */

public class Task24 {

	public static void main(String[] args) {

		double[] arr = { 1, 2, 3, 4 };

		int n = arr.length;

		double[][] res = new double[n][n];

		/*заполняем элементами из линейного массива*/
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = arr[j];
			}
		}

		System.out.println("Дано:");
		for (int i = 0; i < res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = (int) Math.pow(res[i][j], i + 1);
			}
		}

		System.out.println("====================");

		System.out.println("Итог:");
		for (int i = 0; i < res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}

	}

}
