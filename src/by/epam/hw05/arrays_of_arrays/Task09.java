package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали */

public class Task09 {

	public static void main(String[] args) {
		
		int[][] arr = {				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		System.out.println("Дано: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));  
		}
		
		System.out.println("=================");
		
		System.out.println("Элементы, стоящие на диагонали: ");
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == arr[i][i]) {
					System.out.printf("[%d] ", arr[i][j]);
				}else {
					System.out.print("[ ] ");
				}
			}
			System.out.println();
		}

	}

}
