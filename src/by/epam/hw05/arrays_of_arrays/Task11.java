package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

/* 11. Дана матрица размера m * n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая 
строка слева направо, третья строка справа налево и так далее. 
 */

public class Task11 {

	public static void main(String[] args) {

		int m = 4;
		int n = 3;

		int[][] arr = new int[m][n];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(21);
			}
		}

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println("===================================");

		System.out.println("Итог: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					System.out.printf("[%d] ", arr[i][arr[i].length - 1 - j]);
				}else {
					System.out.printf("[%d] ", arr[i][j]);
				}
			}
			System.out.println();
		}

	}

}
