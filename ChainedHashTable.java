import java.util.Arrays;
import java.util.LinkedList;


public class ChainedHashTable {

	private LinkedList<Integer>[] linkedArray;
	
	public ChainedHashTable(int n) {
		int helper = (int)(Math.log(n) / Math.log(2));
		int m = (int) Math.pow(2, helper + 1);
		for(int i = 0; i < linkedArray.length - 1; i++) {
			linkedArray[i] = new LinkedList<Integer>(Arrays.asList(m));		
		}
	}
	
	public void insert(int x) {
		linkedArray[hash(x)] = hash(x);
	}
	
	public void delete(int x) {
		linkedArray[hash(x)] = null;
	}
	
	public int search(int key) {
		return linkedArray[hash(key)];
	}
	
	public void printTable() {
		for(int i = 0; i < linkedArray.length; i++) {
			System.out.println(linkedArray[i]);
		}
	}
	
	private int hash(Integer x){  
		int key = x;
		double A = Math.random();
		int hashValue = (int) (linkedArray.length * ((key * A)%1));
		return hashValue;
	}
}
