import java.util.*;

/**
 * 
 * Caleb Styles
 * September 15, 2022
 * CSCI 333
 * RAM Algorithms
 * 
 */
public class RAMAlgorithms {
	
	/**
	 * 
	 * @param arr1 array we want to sort
	 * @param arr2 array we want to fill with sorted values
	 * @param k biggest value of the first array
	 */
	
	public static void countingSort(int[] arr1, int[] arr2, int k) {
		int[] arr3 = new int[k + 1];
		
		for(int i = 0; i < k; i++) {
			arr3[i]= 0;
		}
		for(int i = 0; i < arr1.length; i++) {
			arr3[arr1[i]]++;
		}
		for(int i = 1; i <= k; i++) {
			arr3[i] = arr3[i] + arr3[i - 1];
		}
		for(int i = arr1.length - 1; i >= 0; i--) {
			arr2[arr3[arr1[i]] - 1] = arr1[i];
			arr3[arr1[i]]--;
		}
	}
	
	/**
	 * 
	 * @param arr1 The array we want to search for the statistic
	 * @param p the lower boundary
	 * @param r the upper boundary
	 * @param i the ith order of statistic
	 * @return
	 */
	
	public static int rqHelper(int[] arr1, int p, int r, int i) {
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		return randomizedQuickSelect(arr2, p, r, i);
	}
	
	public static int randomizedQuickSelect(int[] arr, int p, int r, int i) {
		if(p == r) {
			return arr[p];
		}
		Random rand = new Random();
//		System.out.println("int z = rand.nextInt((" + r + "-" + p + ")+1) + " + p + ";");
		int z = rand.nextInt(r - p) + p;

		swap(arr, z, r);
		int q = partition(arr, p, r);
		int k = q - p + 1;
		
		if(i == k) {
			return arr[q];
		}else if(i < k) {
			return randomizedQuickSelect(arr, p, q - 1, i);
		}else {
			return randomizedQuickSelect(arr, q + 1, r, i - k);
		}
	}
	
	public static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	
	private static int partition(int[] array, int p, int r) {
		int x = array[r];
		int index = p - 1; 
		for(int j = p; j <= r-1; j++) {
			if(array[j] < x) {
				index = index + 1;
				swap(array, index, j);
			}
		}
		swap(array, index + 1, r);
		return index + 1;
	}
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("COUNTING SORT ALGORITHM");
		
		int[] arr1 = {34, 32, 241, 35};
		int[] arr2 = new int[arr1.length];
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
		countingSort(arr1, arr2, 241);
		System.out.println("arr2 after sort: " + Arrays.toString(arr2));
		System.out.println();
		
		int[] arr3 = {4, 7, 2, 5};
		int[] arr4 = new int[arr3.length];
		System.out.println("arr3: " + Arrays.toString(arr3));
		System.out.println("arr4: " + Arrays.toString(arr4));
		countingSort(arr3, arr4, 7);
		System.out.println("arr4 after counting sort: " + Arrays.toString(arr4));
		System.out.println();
		
		int[] arr5 = {5, 4, 3, 2, 12, 523, 421, 53, 321, 21, 1};
		int[] arr6 = new int[arr5.length];
		System.out.println("arr5: " + Arrays.toString(arr5));
		System.out.println("arr6: " + Arrays.toString(arr6));
		countingSort(arr5, arr6, 523);
		System.out.println("arr6 after counting sort: " + Arrays.toString(arr6));
		System.out.println();
		
		int[] arr7 = {7, 4, 2 ,1};
		int[] arr8 = new int[arr7.length];
		System.out.println("arr7: " + Arrays.toString(arr7));
		System.out.println("arr8: " + Arrays.toString(arr8));
		countingSort(arr7, arr8, 7);
		System.out.println("arr8 after counting sort: " + Arrays.toString(arr8));
		System.out.println();
		
		int[] arr9 = {20, 16, 199, 43};
		int[] arr10 = new int[arr9.length];
		System.out.println("arr9: " + Arrays.toString(arr9));
		System.out.println("arr10: " + Arrays.toString(arr10));
		countingSort(arr9, arr10, 199);
		System.out.println("arr10 after counting sort: " + Arrays.toString(arr10));
		System.out.println();
		
		System.out.println();
		System.out.println("RANDOMIZED QUICK SELECT ALGORITHM");
		System.out.println();
		
		int[] arr11 = {4, 5, 3, 32, 53, 21, 11};
		System.out.println("arr11: " + Arrays.toString(arr11));
		System.out.println("randomized quick select arr15: " + rqHelper(arr11, 0, arr11.length - 1, 5));
		System.out.println();
		
		int[] arr12 = {2, 43, 32, 21, 112, 12, 21, 5};
		System.out.println("arr12: " + Arrays.toString(arr12));
		System.out.println("randomized quick select arr15: " + rqHelper(arr12, 0, arr12.length - 1, 5));
		System.out.println();
		
		int[] arr13 = {5, 6, 4, 3, 2, 1, 55, 43, 21, 3};
		System.out.println("arr13: " + Arrays.toString(arr13));
		System.out.println("randomized quick select arr15: " + rqHelper(arr13, 0, arr13.length - 1, 8));
		System.out.println();
		
		int[] arr14 = {32};
		System.out.println("arr14: " + Arrays.toString(arr14));
		System.out.println("randomized quick select arr15: " + rqHelper(arr14, 0, arr14.length - 1, 32));
		System.out.println();
		
		int[] arr15 = {5, 64, 54, 62, 12, 32, 6, 15, 31, 21};
		System.out.println("arr15: " + Arrays.toString(arr15));
		System.out.println("randomized quick select arr15: " + rqHelper(arr15, 0, arr15.length - 1, 6));
		System.out.println();
		
		
	}

}