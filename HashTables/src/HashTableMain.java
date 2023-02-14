

public class HashTableMain {

	public static void main(String[] args) {
		ChainedHashTable c1 = new ChainedHashTable(20);
		OpenAddressedHashTable o1 = new OpenAddressedHashTable(20);

		for(int i = 0; i < 100; i++){
			c1.insert(i);
			o1.insert(i);
		}

		System.out.println("Chained Hash Table");
		System.out.println();
		System.out.println("Table before deletion");
		c1.printTable();
		
		c1.delete(0);
		c1.delete(13);
		c1.delete(10);
		c1.delete(17);
		c1.delete(14);
		
		System.out.println();
		System.out.println("Table after deletion");
		c1.printTable();
		
		System.out.println();
		System.out.println("All searches for the Chained Hash Table");
		System.out.println("The index column for 100 is " + c1.search(100));
		System.out.println("The index column for 5 is " + c1.search(5));
		System.out.println("The index column for 75 is " + c1.search(75));
		System.out.println("The index column for 199 is " + c1.search(199));
		System.out.println("The index column for 10 is " + c1.search(10));
		System.out.println("The index column for 4 is " + c1.search(4));
		System.out.println("The index column for 17 is " + c1.search(17));
		System.out.println("The index column for 20 is " + c1.search(20));
		System.out.println("The index column for 90 is " + c1.search(90));
		System.out.println("The index column for 1050 is " + c1.search(1050));		
		
		System.out.println();
		System.out.println("Open Addressed Hash Table");
		System.out.println();
		System.out.println("Table before deletion");
		o1.printTable();
		
		o1.delete(0);
		o1.delete(13);
		o1.delete(10);
		o1.delete(17);
		o1.delete(14);
		
		System.out.println("Table after deletion");
		o1.printTable();
		
		System.out.println();
		System.out.println("All searches for the Open Addressed Hash Table");
		System.out.println("The index for 742 is " + o1.search(742));
		System.out.println("The index for 5 is " + o1.search(5));
		System.out.println("The index for 7 is " + o1.search(7));
		System.out.println("The index for 8 is " + o1.search(8));
		System.out.println("The index for 10 is " + o1.search(10));
		System.out.println("The index for 89 is " + o1.search(89));
		System.out.println("The index for 73 is " + o1.search(73));
		System.out.println("The index for 20 is " + o1.search(20));
		System.out.println("The index for 91 is " + o1.search(91));
		System.out.println("The index for 11 is " + o1.search(11));		

	}
	
}