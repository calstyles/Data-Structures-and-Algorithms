
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
	public List<Node> nodes;
	public List<Edge> edges;
	
	public Graph(List<Node> nodes, List<Edge> edges) {
		this.nodes = nodes;
		this.edges = edges;
	}
	
	private void initializeSingleSource(int s) {
		for(Node v : nodes) {
			v.d = Integer.MAX_VALUE;
			v.p = null;
		}
		nodes.get(s).d = 0;
	}
	
	private void relax(Node u, Node v, boolean isRushHour) {
		double w = 0;
		for(Edge e : edges) {
			if(e.source.equals(u) && e.target.equals(v)) {
				w = e.getWeight(isRushHour);
				break;
			}
		}
		if(u.d == Integer.MAX_VALUE) {
			return;
		}
		Edge edge = v.getBackEdge(u);
		if(v.d > (u.d + edge.getWeight(isRushHour))) {
			v.d = (float) (u.d + edge.getWeight(isRushHour));
			v.p = u;
		}
	}
	
	// TODO: Implement
	public void doDijkstra(Node source, boolean isRushHour) {
		int s = nodes.indexOf(source);
		initializeSingleSource(s);
		Queue<Node> pq = new PriorityQueue<>();
        pq.addAll(nodes);
        while(pq.size() != 0) {
        	Node u = pq.remove();
        	for(Node v : nodes) {
        		relax(u, v, isRushHour);
        	}
        }
	}
	
	// TODO: Implement
	public void printDirections(Node source, Node destination, boolean isRushHour) {
		doDijkstra(source, isRushHour);
	}
	
	private void printDashes(int numDashes) {
		for(int i = 0; i < numDashes; i++) {
			System.out.print("-");
		}
		System.out.println();
		
	}
	// Implemented for you:
	public void printNodes() {
		System.out.println();
		printDashes(25);
		System.out.println("id\tname\tparent");
		printDashes(25);
		for (Node node: this.nodes) {
			System.out.println(node);
		}
		printDashes(25);
		System.out.println();
	}
	
	// Implemented for you:
	public void printEdges(boolean isRushHour) {
		System.out.println();
		printDashes(80);
		System.out.println("id\tname\tsource\ttarget\tweight\tlanes\tspeed\tcongestion\tlength");
		printDashes(80);
		for (Edge edge: this.edges) {
			edge.setIsRushHour(isRushHour);
			System.out.println(edge);
		}
		printDashes(80);
		System.out.println();
	}
}
