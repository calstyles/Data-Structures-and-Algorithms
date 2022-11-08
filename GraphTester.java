
public class GraphTester {
	public static void main(String []args) {
		boolean [][] edge1 = new boolean[6][10];
		boolean [][] edge2 = new boolean[16][16];
		boolean [][] edge3 = new boolean[14][18];
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				if(j%6 == 0) {
					edge1[i][j] = true;
				}else {
					edge1[i][j] = false;
				}
			}
		}
		
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				if(j%5 == 0) {
					edge2[i][j] = false;
				}else {
					edge2[i][j] = true;
				}
			}
		}
		
		for(int i = 0; i < 14; i++) {
			for(int j = 0; j < 18; j++) {
				if(j%3 == 0) {
					edge3[i][j] = false;
				}else {
					edge3[i][j] = true;
				}			
			}
		}
		
		Graph g1 = new Graph(edge1);
		Graph g2 = new Graph(edge2);
		Graph g3 = new Graph(edge3);
		
		System.out.println(g1.toString());
		g1.breadthFirstSearch(1);
		System.out.println(g1.toString());
		
		System.out.println();
		System.out.println(g2.toString());
		g2.breadthFirstSearch(4);
		System.out.println(g2.toString());
		
		System.out.println();
		System.out.println(g3.toString());
		g3.breadthFirstSearch(8);
		System.out.println(g3.toString());
		
		boolean [][] edge4 = new boolean[16][16];
		boolean [][] edge5 = new boolean[15][15];
		boolean [][] edge6 = new boolean[20][20];
		
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				if(j%2 == 0) {
					edge4[i][j] = true;
				}else {
					edge4[i][j] = false;
				}
			}
		}
		
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				if(j%2 == 0) {
					edge5[i][j] = true;
				}else {
					edge5[i][j] = false;
				}	
			}
		}
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if(j%4 == 0) {
					edge6[i][j] = true;
				}else {
					edge6[i][j] = false;
				}	
			}
		}
		
		Graph g4 = new Graph(edge4);
		Graph g5 = new Graph(edge5);
		Graph g6 = new Graph(edge6);
		
		System.out.println();
		System.out.println(g4.toString());
		g4.depthFirstSearch();
		System.out.println(g4.toString());
		
		System.out.println();
		System.out.println(g5.toString());
		g5.depthFirstSearch();
		System.out.println(g5.toString());
		
		System.out.println();
		System.out.println(g6.toString());
		g6.depthFirstSearch();
		System.out.println(g6.toString());
	}
	
}