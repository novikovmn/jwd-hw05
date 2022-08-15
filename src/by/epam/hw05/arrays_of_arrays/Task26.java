package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:  
	а) вычислить сумму отрицательных элементов в каждой строке;  
	б) определить максимальный элемент в каждой строке;  
	в) переставить местами максимальный и минимальный элементы матрицы. */

public class Task26 {

	public static void main(String[] args) {

		int[][] arr = { { 1, -2, -3, 4 }, { 5, 6, 7, -8 }, { 4, 3, -2, -1 } };

		int n = arr.length; // кол-во строк
		int m = arr[0].length; // кол-во столбцов

		System.out.println("Дано: ");
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("=========================================================================");
		
		// a)
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				if (arr[i][j] < 0) {
					sum += arr[i][j];
				}
			}
			System.out.printf("Сумма отрицацельных элементов в строке %d = %d\n", i, sum);
		}

		System.out.println("=========================================================================");

		// б)
		for (int i = 0; i < n; i++) {
			int maxElem = arr[i][0];
			for (int j = 0; j < m; j++) {
				if (arr[i][j] > maxElem) {
					maxElem = arr[i][j];
				}
			}
			System.out.printf("Максимальный элемент в строке %d = %d\n", i, maxElem);
		}

		System.out.println("=========================================================================");

		// в)
		int iMaxElem = 0; // строка мин элем-та
		int jMaxElem = 0; // столбец мин элем-та

		int iMinElem = 0; // строка макс элем-та
		int jMinElem = 0; // столбец макс элем-та

		int maxElem = arr[0][0];
		int minElem = arr[0][0];

		// находим позиции мин и макс эл-в
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (arr[i][j] > maxElem) {
					maxElem = arr[i][j];
					iMaxElem = i;
					jMaxElem = j;
				}

				if (arr[i][j] < minElem) {
					minElem = arr[i][j];
					iMinElem = i;
					jMinElem = j;
				}

			}
		}

		arr[iMaxElem][jMaxElem] = minElem;
		arr[iMinElem][jMinElem] = maxElem;

		System.out.printf("Минимальный(%d) и максимальный(%d) элементы поменяли местами:\n", minElem, maxElem);
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
