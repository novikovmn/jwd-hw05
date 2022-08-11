package by.epam.hw05.arrays_of_arrays;

/* 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 
 */

public class Task06 {

	public static void main(String[] args) {

//				
		int[][] arr = {

				{ 52, 56, 44, 64, 20 }, 
				{ 63, 31, 95, 15 }, 
				{ 94, 36, 84 }, 
				{ 54, 36 }, 
				{ 26 }

		};

		int maxRowLength = 5;

		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%d] ", arr[i][j]);
				if (j == arr[i].length - 1 && j < maxRowLength - 1) {
					for (int k = 0; k < maxRowLength - 1 - j; k++) {
						System.out.print("[  ] ");
					}
				}
			}
			System.out.println();
		}

		System.out.println("==============================");

		for (int j = 1; j < maxRowLength - 1; j += 2) {
			for (int i = 0; i < maxRowLength - j; i++) {
				if (arr[0][j] > arr[maxRowLength - j - 1][j]) {
					System.out.printf("[%d]\n", arr[i][j]);
				}
			}
			System.out.println();
		}

	}

}
