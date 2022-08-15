package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. 
 */

public class Task35 {

	public static void main(String[] args) {

			int[][] arr = {
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			
			printArray(arr);
			
			int maxEl = findMaxEl(arr);
			
			changeOddElements(arr, maxEl);
			
			printArray(arr);
			

	}
	
	public static void changeOddElements(int[][] arr, int maxEl) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] % 2 != 0) {
					arr[i][j] = maxEl;
				}
			}
		}
	}
	
	public static int findMaxEl(int[][] arr) {
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("===================================");
	}

}
