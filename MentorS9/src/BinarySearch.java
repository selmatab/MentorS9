import java.util.Scanner;
/*Kreirati niz i incijalizovati clanove niza, 
 * ispitati da li odredjeni broj postoji u nizu, ako da na kojoj poziciji,
 *  ako ne onda ispisati poruku.
 * 
 */

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(binarySearch(array, 1, 10, 3));

		// int index=binarySearchLoop(array, num);
		// if(index!=-1)
		// System.out.println("Broj se nalazi u nizu na index poziciji: "+index);
		// else
		// System.out.println("Broj se ne nalazi u nizu");
		// }

		// private static int binarySearchLoop(int []array,int elem){
		// int arrayStart=0;
		// int arrayEnd=array.length;
		//
		//
		// for(int i=0;i<arrayEnd;i++){
		// int mid=(arrayStart+arrayEnd)/2;
		//
		// if(array[mid]==elem)
		// return mid;
		// else if(array[mid]>elem)
		// arrayEnd=mid;
		// else if(array[mid]<elem)
		// arrayStart=mid;
		//
		//
		// }
		// return -1;
		// }
	}
/**
 * rekurzijom ispisati brojeve od 0 do n
 * @param n
 */
	private static void recursion(int n) {
		if (n == 0)
			System.out.println(0);
		else {
			System.out.println(n);
			recursion(n - 1);
		}
	}
/**
 * rekurzijom ispisati sumu brojeva od 1 do n
 * @param n
 * @return sum
 */
	private static int sum(int n) {
		if (n > 0)

			return n + sum(n - 1);

		else
			return 0;

	}
/**
 * binary search- pronaci n u nizu
 * @param array
 * @param start
 * @param end
 * @param n
 * @return
 */
	private static int binarySearch(int[] array, int start, int end, int n) {

		if (start >= end)
			return -1;
		int midd = (start + end) / 2;
		if (n == array[midd])
			return midd;
		if (n > array[midd]) {
			start = midd+1;
			return binarySearch(array, start, end, n);
		}

		if (n < array[midd]) {
			end = midd-1;
			return binarySearch(array, start, end, n);
		}

		return -1;
	}

}
