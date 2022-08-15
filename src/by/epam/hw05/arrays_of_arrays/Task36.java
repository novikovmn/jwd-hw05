package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается 
как  среднее  арифметическое  соседей  соответствующего  элемента  исходной  матрицы.  Построить  результат 
сглаживания заданной матрицы 
 */

public class Task36 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

		int[][] result = new int[arr.length][arr.length];
 
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				if (j == 0) {
					result[i][j] = (arr[i][j] + arr[i][j + 1]) / 2;
				} else if (j == arr.length - 1) {
					result[i][j] = (arr[i][j] + arr[i][j - 1]) / 2;
				}else if(j > 0 && j < arr.length - 1) {
					result[i][j] = (arr[i][j-1] + arr[i][j+1]) / 2;
				}
			}
		}
		
		System.out.println("=============================");
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
		

	}

}
