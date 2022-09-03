import java.util.*;

public class exam_problems {

	public static int recursive_sum(int[] array, int s, int e) {
		int subarraySize = e-s;
		int midpoints = s + (subarraySize)/2;
		if(subarraySize == 1) {
			return array[s];
		}
		else {
			System.out.println(e);
			return recursive_sum(array, s, midpoints) +
					recursive_sum(array, midpoints, e);
		}
	}
	
//	public static int recursive_min(int[] array, int s, int e) {
//		int subarraySize = e - s;
//		if(subarraySize == 1) {
//			return array[s];
//		}
//		int thisMin = array[s];
//		int thatMin = recursive_min(array, s + 1, e);
//		if(thisMin < thatMin) {
//			return thisMin;
//		}else {
//			return thatMin;
//		}
//	}
//	
	public static void main(String[] args) {
		
		int[] array = {0, 2, 3, 4};
		int x = 0;
		int y = 4;
		int z1 = recursive_sum(array, x, y);
//		int z2 = recursive_min(array, x, y);
		
		System.out.println(z1);
//		System.out.println(z2);
	}

}
