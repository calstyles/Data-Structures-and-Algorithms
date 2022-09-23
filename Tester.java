
public class Tester {

	public static void main(String[] args) {
		int n = 4;
		int helper = (int)(Math.log(n) / Math.log(2));
		int m = (int) Math.pow(2, helper + 1);
		Integer[] integerArray = new Integer[m];
		
		System.out.println(m);

	}
	
}
