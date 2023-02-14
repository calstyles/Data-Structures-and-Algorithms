/**
 * 
 * @author Caleb Styles
 * November 9, 2022
 * CSCI333
 * BFS&DFS
 * 
 * Creates the graph that allows us to perform the DFS and BFS algorithms
 * 
 */

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	private int n;
	private int time;
	private boolean[][] edge;
	private Node [] nodes;
	
	/**
	 * 
	 * @param edge the adjacency matrix storing edge information of every node
	 */
	
	public Graph(boolean[][] edge) {
		this.edge = edge;
		n = edge.length;
		time = 0;
		nodes = new Node[n];
		
		for(int i = 0; i < nodes.length; i++) {
			nodes[i] = new Node(i);
		}
	}
	
	/**
	 * This algorithm visits the most recently visited vertex's neighbors first
	 */
	
	public void depthFirstSearch() {
		for(Node u : nodes) {
			u.setColor(0);
			u.setParent(-1);
		}
		
		time = 0;
		
		for(Node u : nodes) {
			if(u.getColor() == 0) {
				dfsVisit(u);
			}
		}
	}
	
	private void dfsVisit(Node u) {
		time++;
		u.setDTime(time);
		u.setColor(1);
		for(int i = 0; i < edge.length; i++) {
			Node v = nodes[i];
			if(edge[u.getName()][i]) {
				if(v.getColor() == 0) {
					v.setParent(u.getName());
					dfsVisit(v);
				}
			}
		}
		u.setColor(2);
		time++;
		u.setFTime(time);
	}
	
	/**
	 * 
	 * This algorithm visits the oldest visited vertex's neighbors first
	 * @param s the item that we want to search for
	 */
	
	public void breadthFirstSearch(int s) {
		
		for(int i = 0; i < nodes.length; i++) {
			nodes[i].setColor(0);
			nodes[i].setDistance(Integer.MAX_VALUE);
			nodes[i].setParent(-1);
		}
		nodes[s].setColor(1);
		nodes[s].setDistance(0);
		nodes[s].setParent(-1);

		Queue<Integer> queuer = new LinkedList<>();
		queuer.add(s);
		while(queuer.size() != 0) {
			int i = queuer.remove();
			nodes[i].setColor(2);
			for(int j = 0; j < nodes.length; j++) {
				if(edge[i][j]) {
					if(nodes[j].getColor() == 0) {
						nodes[j].setColor(1);
						nodes[j].setDistance(nodes[i].getDistance() + 1);
						nodes[j].setParent(i);
						queuer.add(j);
					}
				}
			}
		}
	}
	
	/**
	 * The toString method that prints out the graph data
	 */
	
	@Override
	public String toString() {
		String str = "";
		for(int i = 0; i < edge.length; i++) {
			for(int j = 0; j < edge[i].length; j++) {
				str += edge[i][j] + " ";
			}
			str += "\n";
		}
		str += "\n";
		
		for(int i = 0; i < nodes.length; i++) {
			str += nodes[i].toString() + "\n";
		}
		
		str += "\n";
		
		return str;
	}
	
}