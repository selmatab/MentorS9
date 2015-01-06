
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 3, 8, 9, 4, 5, 1, 6, 0, 7 };
		sysOut(array);
		selectionSort(array);
		sysOut(array);

	}
	
	private static void sysOut(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i]);
		System.out.println();

	}

	private static void selectionSort(int[] array) {
		int min,temp;
		for (int i = 0; i < array.length; i++) {
			min=i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] <array[min]) {
					min = j;
				}
				
			}
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;			
			
		}
		
	}
	


}