package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 23. Сформировать квадратную матрицу порядка N по правилу:  

 * a[i][j] = sin((i^2 - j^2) / n)
 *
 *и подсчитать количество положительных элементов в ней. 

 */

public class Task23 {

	public static void main(String[] args) {

		int n = 6;

		double[][] arr = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = Math.sin((i * i - j * j) / n);
			}
		}
		
		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int counter = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i][j] > 0) {
					counter++;
				}
			}
		}
		
		System.out.println("========================================");
		
		System.out.printf("Количество положительных элементов = %d", counter);
		

	}

}
