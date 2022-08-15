package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец 
содержит максимальную сумму. 
 */

public class Task28 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Дано:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("=====================================");

		// находим суммы столбцов
		for (int j = 0; j < arr.length; j++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i][j];
			}
			System.out.printf("Сумма столбца %d = %d\n", j, sum);
		}

		System.out.println("=====================================");

		// считаем, что макс сумма - это сумма 0-го столбца
		int maxSum = 0;
		for (int j = 0; j < 1; j++) {
			for (int i = 0; i < arr.length; i++) {
				maxSum += arr[i][j];
			}
		}

		// находим макс сумму элементов столбцов
		int maxIndexColumn = 0;
		for (int j = 1; j < arr.length; j++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i][j];
			}

			if (sum > maxSum) {
				maxSum = sum;
				maxIndexColumn = j;
			}
		}

		System.out.printf("Максимальная сумма чисел находится в столбце %d = %d", maxIndexColumn, maxSum);

	}

}
