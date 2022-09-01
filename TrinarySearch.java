	/*
	 * Caleb Styles
	 * August 20, 2022
	 * CSCI333, TrinarySearch Program
	 *
	 * This is a TrinarySearch program that will split an array into thirds and look
	 * for a specified value utilizing recursion
	 */
	
	public class TrinarySearch{
	
	/**
	 * 
	 * If the start of the array contains the key, return start; Otherwise, return the
	 * value when it appears in the array; Return -1 as a fail case if the key is not found
	 *
	 * @param arr The array is searched through throughout until it reaches the key or there is none to be found
	 * @param key Once the key is reached inside the array the index it is found in will be returned
	 * @param start Indicates the start of the program and will be incremented recursively
	 * @param end This element indicates the end of the array
	 * @return The index of the array will be returned as start until it cycles 
	 * through the program and will return -1 once the end is reached
	 */
	
		public static int trinarySearchHelper(int[] arr, int key, int start, int end){
			if(arr[start] == key) {
				return start;
			}else if(start < end && end <= arr.length){
				start += 1;
				return trinarySearchHelper(arr, key, start, end+1);
			}
			return -1;
		}
		
	/**
	 * 
	 * The program below is the trinarySearch function which will split the array into
	 * thirds and look for the specified key that is inside the array
	 * 
	 * @param arr Gets split into thirds and is searched through
	 * @param key The element that we need to look for inside the array
	 * @param start The element that indicates the start of the array
	 * @param end The element that indicates the end of the array
	 * @return Each return statement indicates the position the algorithm is going through the array and 
	 * will return once the end and start are close enough together. Further details for each statement are provided below
	 */
		
	public static int trinarySearch(int[] arr, int key, int start, int end) {
		
		/*
		* If the start and end are close together, traverse the
		* array until you find the left-most element
		*/
		
		if(end - start < 3) {
			return trinarySearchHelper(arr, key, start, end);
		}
		
		/*
		* Splits the array into thirds
		*/
		
		int firstMid = start + (end - start)/3;
		int lastMid = firstMid + (end - start)/3;
		
		/*
		* If the first middle of the array's section contains the key, return the index
		*/
		
		if(arr[firstMid] == key) {
			return trinarySearch(arr, key, start, firstMid);
		}
		
		/*
		* If the last middle of the array's section contains the key, return the index
		*/
		
		if(arr[lastMid] == key) {
			return trinarySearch(arr, key, firstMid+1, lastMid);
		}
		
		/*
		* If the key is less than the last two thirds of the array, then cycle through to the beginning
		*/
		
		if(key < arr[firstMid]) {
			return trinarySearch(arr, key, start, firstMid-1);
		
		
		/*
		* If the key is greater than the first two thirds of the array, then cycle through to the end
		*/
		
		}else if(key > arr[lastMid] && arr[firstMid] < key) {
			return trinarySearch(arr, key, lastMid+1, end);
		
		/*
		* If the key is located in the middle, cycle through its firstMid and lastMid
		*/
		
		}else{
			return trinarySearch(arr, key, firstMid+1, lastMid-1);
		}
	}
	
	/*
	* Main method to test results of the TrinarySearch Program
	*/
	
	public static void main(String[] args) {
	
		int[] test1 = {0,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,5,6,6,7,8,9};
		int start1 = 0;
		int end1 = test1.length;
		int key1 = 5;
		int result1 = trinarySearch(test1, key1, start1, end1);
		String msg1 = result1 < 0 ? "That number doesn't exist in the test1 array!" : "The number is located at index " + result1 + " in the test1 array.";
		System.out.println(msg1);
		
		int[] test2 = {0,1,2,3,4,5,6,7,8,9};
		int start2 = 0;
		int end2 = test2.length;
		int key2 = 5;
		int result2 = trinarySearch(test2, key2, start2, end2);
		String msg2 = result2 < 0 ? "That number doesn't exist in the test2 array!" : "The number is located at index " + result2 + " in the test2 array.";
		System.out.println(msg2);
		
		int[] test3 = {0,1,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		int start3 = 0;
		int end3 = test3.length;
		int key3 = 9;
		int result3 = trinarySearch(test3, key3, start3, end3);
		String msg3 = result3 < 0 ? "That number doesn't exist in the test3 array!" : "The number is located at index " + result3 + " in the test3 array.";
		System.out.println(msg3);
		
		int[] test4 = {0,2,4,5,5,7,9};
		int start4 = 0;
		int end4 = test4.length;
		int key4 = 9;
		int result4 = trinarySearch(test4, key4, start4, end4);
		String msg4 = result4 < 0 ? "That number doesn't exist in the test4 array!" : "The number is located at index " + result4 + " in the test4 array.";
		System.out.println(msg4);
		
		int[] test5 = {0,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,5,6,6,7,8,109};
		int start5 = 0;
		int end5 = test5.length;
		int key5 = 111;
		int result5 = trinarySearch(test5, key5, start5, end5);
		String msg5 = result5 < 0 ? "That number doesn't exist in the test5 array!" : "The number is located at index " + result5 + " in the test5 array.";
		System.out.println(msg5);
	}
}
