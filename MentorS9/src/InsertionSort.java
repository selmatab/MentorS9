
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { 3, 8, 9, 4, 5, 1, 6, 0, 7 };
		sysOut(array);
		insertionSort(array);
		sysOut(array);
	}

	private static void sysOut(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i]);
		System.out.println();

	}

	private static void insertionSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				while (j > 0 && array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					j--;
				}

			}
		}
	}

	
}
