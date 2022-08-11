package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

/* 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]. 
*/

public class Task02 {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		Random r = new Random();
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(10); // [0;9]
			}
		}
		
		System.out.println("==============================");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
