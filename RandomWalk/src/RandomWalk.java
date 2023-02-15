import java.util.Random;

/**
 * RandomWalk is a class that will indicate how many steps it 
 * will take for a bug to step on every tile on the floor.
 * 
 * @author Caleb Styles
 * @version August 18, 2021
*/

public class RandomWalk {
	
	private int n;
	private int m;
	private int tilesLeft;
	private int allSteps = 0;
	private int bugpositionX;
	private int bugpositionY;
	Random rand = new Random();
	int[][] floor;
	
	/**
	 * @param n sets the value of n inside the constructor
	 * 			so it can be determined from main.
	 * @param m sets the value of m inside the constructor
	 * 			so it can be determined from main.
	 */
	
	public RandomWalk(int n, int m) {
		
		this.n = n;
		this.m = m;
		this.floor = new int[n][m];
		this.bugpositionX = m/2;
		this.bugpositionY = n/2;
		this.tilesLeft = n * m;
	
	}
	
	/**
	 * Sets default values for n and m
	 */
	
	public RandomWalk() {
		this(10,14);
	}
	
	/**
	 * @param x will determine the space the bug will decide to move in the left/right direction.
	 * @param y will determine the space the bug will decide to move in the up/down direction.
	 * @return the minimum and maximum range the bug can explore.
	 */
	
	private boolean validMove(int x, int y) {
		
		if(x==0 && y==0) {
			return false;
		}
		
		x = bugpositionX + x;
		y = bugpositionY + y;
		
		return ( x >= 0 && x < m && y >= 0 && y < n);
		
	}

	/**
	 * The method will determine which of the eight adjacent tiles the bug will go to.
	 */
	
	private void randStep() {
			
			int x = 0;
			int y = 0;
							
			while(!validMove(x, y)) {
			
				x = rand.nextInt(3)-1;
				y = rand.nextInt(3)-1;

			}
		
				bugpositionX += x;
				bugpositionY += y;
				
				if(floor[bugpositionY][bugpositionX] == 0) {
					
					tilesLeft--;
		    	
				}
				
				floor[bugpositionY][bugpositionX]++;
				allSteps++;
				
	}
			
	/**
	 * The method will keep running as long as there are tiles the bug hasn't stepped on.
	 */
	
	public void RunBug() {

		while(tilesLeft > 0) {
			
			randStep();
			
		}
		
	}
	
	/**
	 * @return the total number of steps the bug will have stepped.
	 */
	
	public int getTotalSteps() {
		
		return allSteps;
		
	}
	
	/**
	 * The method will print out the number of times the bug steps on each of the tiles.
	 */
	
	public void printRoom() {

		for(int a = 0; a < n; a++){
		    
			for(int b = 0; b < m; b++){
		        
				System.out.print(floor[a][b] + "\t");
		    
			}
		    
			System.out.println("\n");
		
		}
		
	}
	
	public static void main(String[] args) {
		
		RandomWalk rw = new RandomWalk();
		rw.RunBug();
		rw.printRoom();
		System.out.println();
		System.out.println("Total # of steps: "+ rw.getTotalSteps());
		System.out.println();
		System.out.println();
		
		RandomWalk rw1 = new RandomWalk(5,5);
		rw1.RunBug();
		rw1.printRoom();
		System.out.println();
		System.out.println("Total # of steps: "+ rw1.getTotalSteps());
		System.out.println();
		System.out.println();
		
		RandomWalk rw2 = new RandomWalk(5,7);
		rw2.RunBug();
		rw2.printRoom();
		System.out.println();
		System.out.println("Total # of steps: "+ rw2.getTotalSteps());
		System.out.println();
		System.out.println();
	}

}
