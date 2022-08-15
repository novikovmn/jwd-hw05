package by.epam.hw05.arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/* 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на 
соответствующие  им  позиции  другого,  а  его  элементы  второго  переместить  в  первый.  Номера  столбцов  вводит 
пользователь с клавиатуры. 
 */

public class Task27 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		System.out.println("Дано:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("=====================================");
		
		int firstColIndex = firstColumn();
		int secondColIndex = secondColumn();
		
		if((firstColIndex < 0 || firstColIndex > arr.length - 1) 
				|| (secondColIndex < 0 || secondColIndex > arr.length - 1)) {
			System.out.println("Номера недопустимы!");
			return;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int temp = arr[i][firstColIndex];
				arr[i][firstColIndex] = arr[i][secondColIndex];
				arr[i][secondColIndex] = temp;
			}
		}
		
		System.out.println("Итог:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

	public static int firstColumn() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Введите номер 1-го столбца [0-2]: ");
		System.out.print(">>> ");
		
		while(!s.hasNextInt()) {
			s.nextLine();
			System.out.println("Введено не число! Попробуйте снова.");
			System.out.print(">>> ");
		}
		
		return s.nextInt();
	}
	
	public static int secondColumn() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Введите номер 2-го столбца [0-2]: ");
		System.out.print(">>> ");
		
		while(!s.hasNextInt()) {
			s.nextLine();
			System.out.println("Введено не число! Попробуйте снова.");
			System.out.print(">>> ");
		}
		
		return s.nextInt();
	}

}
