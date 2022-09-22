import java.util.LinkedList;

public class ChainedHashTable {

	public LinkedList<Integer>[] linkedListArray;

	
	public ChainedHashTable(int n) {
		int helper = (int)(Math.log(n) / Math.log(2));
		int m = (int) Math.pow(2, helper + 1);
		linkedListArray = new LinkedList<Integer>[m];
		
	}
	
	public insert() {
		
	}
	
	public delete() {
		
	}
	
	public search() {
		
	}
	
	public void printTable() {
		
	}
	
	private hash() {
		
	}
}
