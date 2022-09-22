import java.util.LinkedList;

public class ChainedHashTable {

	public LinkedList<Integer>[] linkedListArray;

	
	public ChainedHashTable(int n) {
		int m = 0;
		int helper = (int)(Math.log(n) / Math.log(2));
		int maxLength = (int) Math.pow(2, helper + 1);
		while(m != maxLength) {
			linkedListArray[m] = new LinkedList<Integer>();
			m++;
		}		
	}
	
	public insert() {
		
	}
	
	public delete() {
		
	}
	
	public search() {
		
	}
	
	public void printTable() {
		
	}
	
	private int hash(int key) {
		return 1;
	}
}