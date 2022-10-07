
public class BSTNode {

	public BSTNode left;
	public BSTNode right;
	public BSTNode p;
	private int key;
	int size;
	
	public BSTNode(int key) {
		this.left = null;
		this.right = null;
		this.p = null;
		this.key = key;
		this.size = 0;
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
	
	public int getSize() {
        return size;
    }
	
	public void setSize(int size) {
		this.size = size;
	}
	
}
