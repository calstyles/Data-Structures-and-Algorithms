import java.util.LinkedList;

public class ChainedHashTable {

	public LinkedList<Integer>[] linkedArray;

	
	public ChainedHashTable(int n) {
		int helper = (int)(Math.log(n) / Math.log(2));
		int m = (int) Math.pow(2, helper + 1);
		linkedArray = new LinkedList<Integer>[m];
		
	}
	
	public insert() {
		
	}
	
	public delete() {
		
	}
	
	public search() {
		
	}
	
	public void printTable() {
		
	}
	
	private int hash(Integer x){  
		  int hashValue = x.hashCode();
	  
	      hashValue %= linkedArray.length;
	  
	      if (hashValue < 0)
	          hashValue += linkedArray.length;
	  
	      return hashValue;
	  }
}
