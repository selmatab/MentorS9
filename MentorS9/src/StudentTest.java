
public class StudentTest {
	private static void insertionSort(Student[] array) {
		Student temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				while (j > 0 && array[j].compareTo(array[j - 1])==-1) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					j--;
				}

			}
		}
	}

	public static void main(String[] args) {

		Student[] array = new Student[4];
		array[0] = new Student("Selma", 225, 4.5);
		array[1] = new Student("Haris", 225, 4.3);
		array[2] = new Student("Niko", 113, 3.7);
		array[3] = new Student("Saj", 654, 3.3);
		for (int i = 0; i < 4; i++) 
		{
			System.out.println(array[i].toString());
		}
		insertionSort(array);
		System.out.println();

		for (int i = 0; i < 4; i++)
		{
			System.out.println(array[i].toString());
		}
	}
}
