package by.epam.hw05.arrays_of_arrays;

/* 3. Дана матрица. Вывести на экран первый и последний столбцы. 
*/

public class Task03 {

	public static void main(String[] args) {
		
		int[][] arr = {				
				{1,2,3},
				{7,8},
				{4}				
		};
		
		
		int maxLength = arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length > maxLength) {
				maxLength = arr[i].length;
			}
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]\n", arr[i][0]);
		}
		
		System.out.println("=================================");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length == maxLength) {
				System.out.printf("[%d]\n", arr[i][maxLength - 1]);
			}else {
				System.out.println("[ ]");
			}
		}
		
		
		


	}

}
