/**
 * 
 * @author Caleb Styles
 * October 1st, 2022
 * CSCI 333
 * Open Addressed Hash Table
 *
 * This class focuses on implementing the Open Addressed Hash Table data structure 
 * using an integer array with several basic functions such as insert, delete, and search.
 */

public class OpenAddressedHashTable {

	public Integer[] integerArray;
	static final int DELETED = Integer.MIN_VALUE;
	
	/**
	 * 
	 * @param n takes the number and creates the array size of 
	 * the first power of 2 larger than the argument
	 * 
	 */
	
	public OpenAddressedHashTable(int n) {
		int helper = (int)(Math.log(n) / Math.log(2));
		int m = (int) Math.pow(2, helper + 1);
		this.integerArray = new Integer[m];
	}
	
	/**
	 * 
	 * @param key the number we want to insert into the hash table
	 * @return the element's index where it will be stored, returns deleted if an error occurs
	 */
	
	public int insert(int key) {
		for(int i = 0; i < integerArray.length; i++) {
			int j = hash(key, i);
			if(integerArray[j] == null || integerArray[j] == DELETED) {
				integerArray[j] = key;
				return j;
			}
		}
		return DELETED;
	}
	
	/**
	 * 
	 * @param key the value we want to find inside the hash table
	 * @return the index if the value is found, and deleted if not found
	 */
	
	public int search(int key){
        for(int i = 0; i < integerArray.length; i++){
            int j = hash(key,i);
            if(integerArray[j] == null) {
                return DELETED;
            }
            if(integerArray[j] == key){
                return j;
            }
        }
        return DELETED;
    }
	
	/**
	 * 
	 * @param key the number we want to remove from the hash table
	 * @return the deleted value's index, deleted if the value is not found
	 */
	
	public int delete(int key){
        for(int i = 0; i < integerArray.length; i ++){
            int j = hash(key, i);
            if(integerArray[j] == key){
                integerArray[j] = DELETED;
                return j;
            }
        }
        return DELETED;
    }
	
	/**
	 * 
	 * @param key takes a value and hashes it using the multiplication method
	 * @return the index of the hash table
	 */
	
	private int hash(int key) {
		int hashIndex = (int) (integerArray.length * ((key * 0.6180339887)%1));
		return hashIndex;
	}
	
	/**
	 * 
	 * @param key the value inside the hash table we want to search for
	 * @param index of the array that we want to search for
	 * @return the index of the hash table's main array
	 */
	
	private int hash(int key, int index) {
		return (hash(key) + index) % integerArray.length;
	}

	/**
	 * Prints out the hash table
	 */
	
	public void printTable() {
		System.out.print("[");
		for(int i = 0; i < integerArray.length; i++) {
			if(i == integerArray.length - 1) {
				System.out.print(integerArray[i] + "]");
				break;
			}
			System.out.print(integerArray[i] + ", ");		
		}
		System.out.println();
	}
}