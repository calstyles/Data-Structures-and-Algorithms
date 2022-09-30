import java.util.Arrays;
import java.util.LinkedList;


public class ChainedHashTable {

	private LinkedList<Integer>[] linkedArray;
	
	public ChainedHashTable(int n) {
		int helper = (int)(Math.log(n) / Math.log(2));
		int m = (int) Math.pow(2, helper + 1);
		this.linkedArray = new LinkedList[m];
		for(int i = 0; i < linkedArray.length - 1; i++) {
			linkedArray[i] = new LinkedList<>();		
		}
	}
	
	public void insert(int x) {
		linkedArray[hash(x)].push(x);
	}
	
	public void delete(int x) {
		linkedArray[hash(x)].remove();
	}
	
	public int search(int key) {
		int x = hash(key);
		for(int i = 0; i < linkedArray[x].size(); i++) {
			if(linkedArray[x].get(i) == key) {
				return i;
			}
		}
		return -1;
	}
	
	public void printTable() {
		for(int i = 0; i < linkedArray.length; i++) {
			System.out.println(linkedArray[i]);
		}
	}
	
	private int hash(int key){  
		double A = Math.random();
		int hashValue = (int) (linkedArray.length * ((key * A)%1));
		return hashValue;
	}
}
