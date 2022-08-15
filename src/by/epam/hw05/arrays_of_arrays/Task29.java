package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 29. Найти положительные элементы главной диагонали квадратной матрицы*/

public class Task29 {

	public static void main(String[] args) {
		
		int[][] arr = { { -1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, -9 } };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("=================================");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][i] > 0) {
				System.out.printf("Положительный(е) элемент(ы) главной диагонали -> %d\n", arr[i][i]);				
			}
		}

	}

}
