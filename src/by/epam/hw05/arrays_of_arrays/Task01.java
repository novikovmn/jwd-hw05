package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

/*1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и 
вывести на экран. */

public class Task01 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("====================================");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i][r.nextInt(arr[i].length)] = 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
