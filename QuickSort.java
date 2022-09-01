import java.util.Random;
import java.util.Arrays;

/**
 * 
 * Caleb Styles
 * August 31, 2022
 * CSCI 333
 * QuickSort Algorithm
 * 
 * The code below is a representation of a quick sort algorithm and a randomize quick sort algorithm. The partition
 * is used to look at the elements inside of the array and then swap them with the swap helper method. 
 * 
 */

public class QuickSort {

	/**
	 * 
	 * @param array Takes an array and swaps the values inside it
	 * @param x The first element we want to swap
	 * @param y The second element we want to swap
	 */
	
	public static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}

	/**
	 * 
	 * @param array Takes an array and swaps the elements inside if the current element is less than the pivot
	 * @param p The pivot points to the element that we are currently looking at to compare it to the other elements
	 * @param r Indicates the rightmost element of the array
	 * @return The index that we have reached
	 */
	
	private static int partition(int[] array, int p, int r) {

		int x = array[r];
		int index = p - 1; 
		for(int j = p; j <= r - 1; j++) {
			if(array[j] < x) {
				index += 1;
				swap(array, index, j);
			}
		}
		swap(array, index + 1, r);
		return index + 1;
	}
	
	/**
	 * 
	 * @param array Takes an array and then sorts it
	 * @param p The pivot will continue to sort all elements as long as p is less than r
	 * @param r The rightmost index that we are approaching
	 */
	
	public static void quickSort(int[] array, int p, int r) {
		if(p < r) {
			int q = partition(array, p, r);
			quickSort(array, p, q - 1);
			quickSort(array, q + 1, r);
		}
	}

	/**
	 * 
	 * @param array Takes an array and sorts it with a randomized pivot
	 * @param p The pivot is randomized and then swapped with r to sort the array and continues until p < r
	 * @param r The rightmost index that we are approaching
	 */
	
	public static void randomizedQuickSort(int[] array, int p, int r) {
		if (p < r) {
			Random rand = new Random();
			int z = rand.nextInt((r-p) + 1) + p;
			swap(array, z, r);
			int q = partition(array, p, r);
			randomizedQuickSort(array, p, q - 1);
			randomizedQuickSort(array, q + 1, r);
		}
	}
	
	/**
	 * Main method for testing 10 total arrays
	 */
	
	public static void main(String[] args) {
		
		System.out.println("TEST 1");
		int[] test1 = {61,23,12,41,52,13,14};
		System.out.println("Original Array: " + Arrays.toString(test1));
		quickSort(test1, 0, test1.length - 1);
		System.out.println("QuickSort Array: " + Arrays.toString(test1));
		System.out.println();
		
		System.out.println("TEST 2");
		int[] test2 = {0, 26, 16, 90, 86, 65};
		System.out.println("Original Array: " + Arrays.toString(test2));
		randomizedQuickSort(test2, 0, test2.length - 1);
		System.out.println("Randomized QuickSort Array: " + Arrays.toString(test2));
		System.out.println();
		
		System.out.println("TEST 3");
		int[] test3 = {6, 5, 7};
		System.out.println("Original Array: " + Arrays.toString(test3));
		quickSort(test3, 0, test3.length - 1);
		System.out.println("QuickSort Array: " + Arrays.toString(test3));
		System.out.println();
		
		System.out.println("TEST 4");
		int[] test4 = {9, 3, 21, 43, 41, 32, 0};
		System.out.println("Original Array: " + Arrays.toString(test4));
		randomizedQuickSort(test4, 0, test4.length - 1);
		System.out.println("Randomized QuickSort Array: " + Arrays.toString(test4));
		System.out.println();
		
		System.out.println("TEST 5");
		int[] test5 = {10, 9, 8, 7, 6, 5, 3};
		System.out.println("Original Array: " + Arrays.toString(test5));
		quickSort(test5, 0, test5.length - 1);
		System.out.println("QuickSort Array: " + Arrays.toString(test5));
		System.out.println();
		
		System.out.println("TEST 6");
		int[] test6 = {6, 7, 6, 7, 6, 0};
		System.out.println("Original Array: " + Arrays.toString(test6));
		randomizedQuickSort(test6, 0, test6.length - 1);
		System.out.println("Randomized QuickSort Array: " + Arrays.toString(test6));
		System.out.println();
		
		System.out.println("TEST 7");
		int[] test7 = {3, 4, 5, 6, 7, 8, 9};
		System.out.println("Original Array: " + Arrays.toString(test7));
		quickSort(test7, 0, test7.length - 1);
		System.out.println("QuickSort Array: " + Arrays.toString(test7));
		System.out.println();
		
		System.out.println("TEST 8");
		int[] test8 = {0, 1, 0};
		System.out.println("Original Array: " + Arrays.toString(test8));
		randomizedQuickSort(test8, 0, test8.length - 1);
		System.out.println("Randomized QuickSort Array: " + Arrays.toString(test8));
		System.out.println();
		
		System.out.println("TEST 9");
		int[] test9 = {310, 20, 421, 901, 431, 523, 52, 63, 64, 64, 234, 523, 902, 702, 320};
		System.out.println("Original Array: " + Arrays.toString(test9));
		quickSort(test9, 0, test9.length - 1);
		System.out.println("QuickSort Array: " + Arrays.toString(test9));
		System.out.println();
		
		System.out.println("TEST 10");
		int[] test10 = {901, 231, 231, 313, 314, 419, 414, 192, 219, 394, 329, 320, 329};
		System.out.println("Original Array: " + Arrays.toString(test10));
		randomizedQuickSort(test10, 0, test10.length - 1);
		System.out.println("Randomized QuickSort Array: " + Arrays.toString(test10));
		System.out.println();
		
	}	
}
