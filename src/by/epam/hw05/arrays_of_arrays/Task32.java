package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;

/* 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов. */

public class Task32 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{2,1,3},
				{4,6,5},
				{8,9,7}
		};
		
		System.out.println("Дано:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("=========================");
		
		for (int i = 0; i < arr.length; i++) {			
			sort(arr[i]);
		}
		
		System.out.println("По возрастанию:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("=========================");
		
		for (int i = 0; i < arr.length; i++) {			
			reverseSort(arr[i]);
		}
		
		System.out.println("По убыванию:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}
	
	
	
	public static void sort(int[] arr) {		
		for (int i = 1; i < arr.length; i++) {
			int unsortedElement = arr[i];
			int j = i;

			while (j > 0 && unsortedElement < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}

			arr[j] = unsortedElement;
		}		
	}
	
	public static void reverseSort(int[] arr) {		
		for (int i = 1; i < arr.length; i++) {
			int unsortedElement = arr[i];
			int j = i;

			while (j > 0 && unsortedElement > arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}

			arr[j] = unsortedElement;
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
