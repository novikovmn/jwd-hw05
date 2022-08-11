package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

/* 8.  Дан  двухмерный  массив  n*m  элементов.  Определить,  сколько  раз  встречается  число  7  среди  элементов 
массива. 
 */

public class Task08 {

	public static void main(String[] args) {
		
		int n = 3;
		int m = 4;
		int toFind = 7;
		
		int[][] arr = new int[n][m];
		
		Random r = new Random();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = r.nextInt(11);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == toFind) {
					counter++;
				}
			}
		}
		
		System.out.println("===========================");
		
		System.out.printf("Число %d встречается %d раз", toFind, counter);
		

	}

}
