
public class BSTNode {

	public BSTNode left;
	public BSTNode right;
	public BSTNode p;
	private int key;
	
	public BSTNode(int key) {
		left = null;
		right = null;
		p = null;
		this.key = key;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int newKey) {
		this.key = newKey;
	}
	
	public BSTNode getP() {
		return p;
	}
	
	public void setP(BSTNode newP) {
		this.p = newP;
	}
	
	public BSTNode getRight() {
		return right;
	}
	
	public void setRight(BSTNode newRight) {
		this.right = newRight;
	}
	
	public BSTNode getLeft() {
		return left;
	}
	
	public void setLeft(BSTNode newLeft) {
		this.left = newLeft;
	}
	
}
