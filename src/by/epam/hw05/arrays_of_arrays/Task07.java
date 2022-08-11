package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 7. Дан двухмерный массив 5x5. Найти сумму модулей отрицательных нечетных элементов. */

public class Task07 {

	public static void main(String[] args) {
		
		int[][] arr = {
				
				{1, 2, 3, 4, 5},
				{10, 15, 11, -7, -3},
				{151, 13, -10, 81, 3},
				{21, 113, -1, 25, 9},
				{6, 7, 8, 9, 65}
				
		};
		
		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] % 2 != 0 && arr[i][j] < 0) {
					sum += Math.abs(arr[i][j]);
				} 
			}
		}
		
		System.out.println("=======================================");
		
		System.out.printf("Сумма модулей отрицательных нечетных элементов = %d\n", sum);

	}

}
