import java.util.LinkedList;

public class Tester {

	public static void main(String[] args) {
		LinkedList<Integer>[] linkedListArray = null;
		int n = 4;
		int m = 0;
		int helper = (int)(Math.log(n) / Math.log(2));
		int maxLength = (int) Math.pow(2, helper + 1);
		while(m != maxLength) {
			linkedListArray[m] = new LinkedList<Integer>();
			m++;
		}	
		
		System.out.println();

	}
	
}