public class Node {

	private int name;
	private int parent;
	private int dTime;
	private int fTime;
	private int dist;
	private int color;
	
	public Node(int name) {
		this.name = name;
		parent = -1;
		dTime = 0;
		fTime = 0;
		dist = Integer.MIN_VALUE;
		color = 0;
	}
	
	public int getName() {
		return name;
	}
	
	public int getParent() {
		return parent;
	}
	
	public int getDTime() {
		return dTime;
	}
	
	public int getFTime() {
		return fTime;
	}
	
	public int getDistance() {
		return dist;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setName(int name) {
		this.name = name;
	}
	
	public void setParent(int parent) {
		this.parent = parent;
	}
	
	public void setDTime(int dTime) {
		this.dTime = dTime;
	}
	
	public void setFTime(int fTime) {
		this.fTime = fTime;
	}
	
	public void setDistance(int dist) {
		this.dist = dist;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", parent: " + parent 
				+ ", dTime: " + dTime + ", fTime" + ","
				+ " dist: " + dist + ", color: " + 
				color + ".";
	}
	
}