package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

/* 37. Переставить строки матрицы случайным образом. 
 */

public class Task37 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("================================");
		

		
		for (int i = 0; i < arr.length; i++) {
			int randomIndex = new Random().nextInt(arr.length);			
			if(i != randomIndex) {
				int[] temp = arr[i];
				arr[i] = arr[randomIndex];
				arr[randomIndex] = temp;
			}
		
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}

}
