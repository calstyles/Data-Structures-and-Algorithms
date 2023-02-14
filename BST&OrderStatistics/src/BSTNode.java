/**
 * 
 * @author Caleb Styles
 * October 7, 2022
 * CSCI333
 * BST Node
 * 
 * In this class, we will be implementing a Binary Search Tree Node to setup our Binary Search Tree.
 * The BSTNode will take in a left node, a right node, a parent node, a key for the value of the node,
 * and the size to track how large the Binary Search Tree is. There will be getters and setters for
 * each variable that is a part of the BSTNode.
 */

public class BSTNode {

	public BSTNode left;
	public BSTNode right;
	public BSTNode p;
	private int key;
	int size;
	
	/**
	 * 
	 * @param key the value of the node
	 */
	
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
