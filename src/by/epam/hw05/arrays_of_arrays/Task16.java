package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/*16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

public class Task16 {

	public static void main(String[] args) {

		int n = 4;

		int[][] arr = new int[n][n];

		System.out.println("Дано:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("==================================");

		for (int i = 0; i < n; i++) {
			arr[i][i] = (i + 1) * (i + 1 + 1);
		}
		
		System.out.println("Итог:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
