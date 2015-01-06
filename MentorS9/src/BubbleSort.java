
public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 3, 8, 9, 4, 5, 1, 6, 0, 7 };
		bubbleSort(array);

	}

	private static void bubbleSort(int[]array) {
		int temp,length;
		length=array.length-1;
		for (int j = 0; j < array.length; j++) {
		for (int i = 0; i < length; i++) {
		
				if (array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}printArray(array);
			}
		length--;
		}
	}

	private static void printArray(int[] array) {
		for (int num : array)
			System.out.print(num + " ");
		System.out.println();

	}

}