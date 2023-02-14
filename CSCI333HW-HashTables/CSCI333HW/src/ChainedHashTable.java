import java.util.LinkedList;

/**
 * 
 * @author Caleb Styles
 * October 1st, 2022
 * CSCI 333
 * Chained Hash Table
 *
 * This class focuses on implementing the Chained Hash Table data structure using 
 * a linked list array with several basic functions, such as insert delete, and search.
 */

public class ChainedHashTable {

	private LinkedList<Integer>[] linkedArray;
	
	/**
	 * 
	 * @param n takes the number and creates the array size of 
	 * the first power of 2 larger than the argument
	 * 
	 */
	
	public ChainedHashTable(int n) {
		int helper = (int)(Math.log(n) / Math.log(2));
		int m = (int) Math.pow(2, helper + 1);
		this.linkedArray = new LinkedList[m];
		for(int i = 0; i < linkedArray.length ; i++) {
			linkedArray[i] = new LinkedList<>();		
		}
	}
	
	/**
	 * 
	 * @param key takes the number and inserts it into the linked list array
	 */
	
	public void insert(int key) {
		linkedArray[hash(key)].push(key);
	}
	
	/**
	 * 
	 * @param key looks through the hash table and if it finds the value, it will be removed
	 */
	
	public void delete(int key) {
		for(int i = 0; i < linkedArray[hash(key)].size(); i++) {
			if(linkedArray[hash(key)].get(i) == key) {
				linkedArray[hash(key)].remove(i);
			}
		}
	}
	
	/**
	 * 
	 * @param key the number we want to find inside the hash table
	 * @return the index column of the array the value is found in, returns -1 if not found
	 */
	
	public int search(int key) {
		for(int i = 0; i < linkedArray[hash(key)].size(); i++) {
			if(linkedArray[hash(key)].get(i) == key) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Prints out the hash table
	 */
	
	public void printTable() {
		for(int i = 0; i < linkedArray.length; i++) {
			System.out.println(linkedArray[i]);
		}
	}
	
	/**
	 * 
	 * @param key takes a value and hashes it using the multiplication method
	 * @return the index of the hash table
	 */
	
	private int hash(int key){  
		int hashIndex = (int) (linkedArray.length * ((key * 0.6180339887)%1));
		return hashIndex;
	}
}