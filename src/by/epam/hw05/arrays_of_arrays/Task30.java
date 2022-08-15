package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

/* 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в 
которых число 5 встречается три и более раз */

public class Task30 {

	public static void main(String[] args) {
		
		int n = 10;
		int m = 20;
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = new Random().nextInt(16);
			}
		}
		
		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));			
		}
		
		System.out.println("==========================================");
		
		int counter = 3;
		int flag = 0;
		for (int i = 0; i < n; i++) {
			int rowCounter = 0;
			for (int j = 0; j < m; j++) {
				if(arr[i][j] == 5) {
					rowCounter++;
				}
			}
			
			if(rowCounter >= counter) {
				flag++;
				System.out.printf("Номер строки с 5-кой (от 3 шт. и больше) -> %d\n", i);
			}
		}
		
		if(flag == 0) {
			System.out.println("Строк, удовлетворяющих условию, нет!");
		}
		
		
	}

}
