package by.epam.hw05.arrays_of_arrays;

/*4. Дана матрица. Вывести на экран первую и последнюю строки*/

public class Task04 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3  }, 
						{ 7, 8 }, 
						{ 4  } 
					};

		/*
		 * находим макс длину среди строк
		 * */
		int maxLength = arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length > maxLength) {
				maxLength = arr[i].length;
			}
		}

		/*
		 * Выводим исходный массив, заполняя пустоши (если есть)
		 * */
		System.out.println("Дано: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%d] ", arr[i][j]);
				if(j  ==  arr[i].length - 1 && j < maxLength - 1) {
					for (int k = 0; k < maxLength - 1 - j ; k++) {
						System.out.print("[ ] ");
					}
				}
			}			
			System.out.println();
		}
		
		System.out.println("===========================");		

		
		/*
		 * выводим первую строку
		 * */
		int[] firstString = arr[0];		
		for (int i = 0; i < firstString.length; i++) {
			System.out.printf("[%d] ", firstString[i]);
		}
		
		System.out.println();
		System.out.println("===========================");
		
		/*
		 * выводим последнюю строку
		 * */
		int[] lastString = arr[arr.length - 1];		
		for (int i = 0; i < lastString.length; i++) {
			System.out.printf("[%d] ", lastString[i]);
			if(i == lastString.length-1 && i < maxLength - 1) {
				for (int k = 0; k < maxLength - 1 - i; k++) {
					System.out.print("[ ] ");
				}
			}
		}
		
		
		

	}
}
