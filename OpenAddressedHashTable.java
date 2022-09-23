
public class OpenAddressedHashTable {

	public Integer[] integerArray;
	
	public OpenAddressedHashTable(int n) {
		int helper = (int)(Math.log(n) / Math.log(2));
		int m = (int) Math.pow(2, helper + 1);
		integerArray = new Integer[m];
	}
	
	public static int insert(Integer[] integerArray, int x) {
		int k = x;
		for(int i = 0; i < integerArray.length; i++) {
			int j = hash(k, i);
			return j;
		}
	}
	
//	SEARCH(T, k)
//	for i = 0 to m-1
//	   j = h(k, i)
//	   if T[j] == NULL 	
//	      return NULL  	
//	   if T[j].key == k 
//	      return T[j]
//	return NULL
	
	private int hash(Integer x){  
		  int hashValue = x.hashCode();
	  
	      hashValue %= integerArray.length;
	  
	      if (hashValue < 0)
	          hashValue += integerArray.length;
	  
	      return hashValue;
	}

	
	public void printTable() {
		
	}
	
}
