/**
 * 
 * @author Caleb Styles
 * August 29, 2022
 * CSCI333
 * MaxHeap
 * 
 * The code shown below takes an array and forms a max heap based on how the values are arranged 
 * inside the array. It will also sort the heap if the heapSort function is used.
 * 
 */

public class MaxHeap {
	
	private int array[];
	private int heapSize;
	
	/**
	 * @param array Gets the array that the user wants to form into a max heap
	 */
	
	public MaxHeap(int[] array) {
		this.array = array;
		this.heapSize = array.length;
		buildMaxHeap();
	}

	/**
	 * 
	 * @param i Gets the index of the left child
	 * @return The index of the left child is returned
	 */
	
	private int leftChildOf(int i) {
		if( heapSize < i) {
			return -1;
		}else {
			return 2 * i + 1;
		}
	}
	
	/**
	 * 
	 * @param i gets the index of the right child
	 * @return The index of the right child is returned
	 */
	
	private int rightChildOf(int i) {
		if(heapSize < i) {
			return -1;
		}else {
			return 2 * i + 2;
		}
	}

	/**
	 * The function below prints the max heap, and if sorted it will print in order
	 */
	
	public void printMaxHeap() {
		System.out.print("[");
		for(int i = 0; i < heapSize; ++i) {
			if(i == heapSize - 1) {
				System.out.print(array[i] + "]");
				break;
			}
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		System.out.println();
	}

	/**
	 * 
	 * @param i Gets the index of the heap and will go through the function to find it
	 */
	
	private void maxHeapify(int i) {
		
		int left = leftChildOf(i);
		int right = rightChildOf(i);
		int large = i;
		if(left < heapSize &&  array[large] < array[left]) {
			large = left;
		}else {
			large = i;
		}
		if(right < heapSize && array[large] < array[right]){
			large = right;
		}
		if(large != i){
			int temp = array[i];
			array[i] = array[large];
			array[large] = temp;
			maxHeapify(large);
		}
	}
	
	/**
	 * 
	 * Builds the max heap out of the array
	 */

	private void buildMaxHeap() {
		for(int i = (heapSize/2) - 1; i >= 0; i--) {
			maxHeapify(i);
		}
	}
	
	/**
	 * Sorts the elements of the heap in order
	 */
	
	public void heapSort() {
		buildMaxHeap();
		int backUp = heapSize;
		for(int i = heapSize - 1; i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapSize--;
			maxHeapify(0);
		}
		heapSize = backUp;
	}
}