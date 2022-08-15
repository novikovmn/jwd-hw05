package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

/*  31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней. */

public class Task31 {

	public static void main(String[] args) {

		int[][] array = createArray(10);
		printArray(array);
		System.out.printf("Количество двухзначных чисел = %d", countNumbersWithTwoDigits(array));

	}

	public static int countNumbersWithTwoDigits(int[][] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (checkIfTwoDigits(arr[i][j])) {
					count++;
				}
			}
		}

		return count;
	}

	public static boolean checkIfTwoDigits(int num) {
		int countOfDivide = 2;
		int counter = 0;

		while (num != 0) {
			num /= 10;
			counter++;
		}

		if (counter == countOfDivide) {
			return true;
		} else {
			return false;
		}

	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("=======================================================");
	}

	public static int[][] createArray(int length) {
		int[][] arr = new int[length][length];

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				arr[i][j] = new Random().nextInt(1000);
			}
		}

		return arr;
	}

}
