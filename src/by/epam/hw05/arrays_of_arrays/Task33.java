package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/*33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/

public class Task33 {

	public static void main(String[] args) {

		int[][] arr = { { 8, 6, 5 }, { 4, 9, 3 }, { 2, 1, 7 } };

		System.out.println("Дано:");
		printArray(arr);

		System.out.println("=========================");

		sort(arr);

		System.out.println("Столбцы по возрастанию:");
		printArray(arr);

		System.out.println("=========================");

		reverseSort(arr);

		System.out.println("Столбцы по убыванию:");
		printArray(arr);

	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public static void sort(int[][] arr) {
		for (int j = 0; j < arr.length; j++) {
			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int i = 0; i < arr.length - 1; i++) {
					if (arr[i][j] > arr[i + 1][j]) {
						sorted = false;
						int temp = arr[i][j];
						arr[i][j] = arr[i + 1][j];
						arr[i + 1][j] = temp;
					}
				}
			}
		}
	}

	public static void reverseSort(int[][] arr) {
		for (int j = 0; j < arr.length; j++) {
			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int i = 0; i < arr.length - 1; i++) {
					if (arr[i][j] < arr[i + 1][j]) {
						sorted = false;
						int temp = arr[i][j];
						arr[i][j] = arr[i + 1][j];
						arr[i + 1][j] = temp;
					}
				}
			}
		}
	}

}
