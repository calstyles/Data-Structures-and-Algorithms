import java.util.Random;

public class RAMAlgorithms {
	
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
	
	public static int[] countingSort(int[] arr1, int[] arr2, int k) {
		int[] arr3 = new int[k];
		
		for(int i = 0; i < k - 1; i++) {
			arr3[i] = 0;
		}
		for(int i = 1; i < arr1.length; i++) {
			System.out.println("first i: " + i);
			arr3[arr1[i]]++;
			System.out.println("second i: " + i);
		}
		for(int i = 1; i < k - 1; i++) {
			arr3[i] = arr3[i] + arr3[i - 1];
		}
		for(int i = arr1.length - 1; i > 0; i++) {
			arr2[arr3[arr1[i]]] = arr1[i];
			arr3[arr1[i]]--;
		}
			
		return arr3;
	}
	
	public static int randomizedQuickSelect(int[] arr, int p, int r, int i) {
		if(p == r) {
			return arr[p];
		}
		Random rand = new Random();
		int z = rand.nextInt((r-p) + 1) + p;
		int q = partition(arr, p, r);
		swap(arr, z, r);
		int k = q - p + 1;
		if(i == k) {
			return arr[q];
		}else if(i < k) {
			return randomizedQuickSelect(arr, p, q-1, i);
		}else {
			return randomizedQuickSelect(arr, q+1, r, i-k);
		}	
	}
	
	public static void main(String[] args) {
		int[] arr1 = {34, 32, 241, 35};
		int[] arr2 = new int[4];
		countingSort(arr1, arr2, 241);
	}

}
