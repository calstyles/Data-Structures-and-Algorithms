/**
 * 
 * @author Caleb Styles
 * October 7, 2022
 * CSCI333
 * Binary Search Tree
 * 
 * We are going to be implementing the Binary Search Tree data structure for this assignment.
 * This class will consist of various different methods to manipulate and search through the
 * data of the tree. The methods of this assignment are as such: inserting nodes, deleting them 
 * with the transplant and delete methods, searching for various nodes with the search, minimum, 
 * maximum, predecessor and successor methods, traversing through the tree with PreOrder, InOrder,
 * and PostOrder Traversals, and using order statistic queries with the select and rank methods.
 *
 */


public class BinarySearchTree {

	public BSTNode root;
	public int size;

	/**
	 * Constructor of the tree
	 */
	
	public BinarySearchTree(){
		root = null;
		size = 0;
	}
	
	/**
	 * 
	 * @return the size of the tree
	 */
	
	public int getSize() {
		return size;
	}
	
	private void transplant(BinarySearchTree T, BSTNode u, BSTNode v) {
		if(u.p == null) {
			T.root = v;
		}else if(u == u.p.getLeft()){
			u.getP().setLeft(v);
		}else u.getP().setRight(v);
		if(v != null) {
			v.setP(u.getP());
		}
	}
	
	/**
	 * Searches for the value inside the tree
	 * 
	 * @param key the value we want to search for inside the tree
	 * @return the address of the value, null if not found
	 */
	
	public BSTNode search(int key) {
		return search(root, key);
	}
	
	private BSTNode search(BSTNode x, int k) {
		if(x == null) {
			return null;
		}
		if(k == x.getKey()) {
			return x;
		}
		if(k < x.getKey()) {
			return search(x.getLeft(), k);
		}
		else return search(x.getRight(), k);
	}
	
	/**
	 * 
	 * @return the leftmost element of the tree
	 */
	
	public BSTNode minimum() {
		return minimum(root);
	}
	
	private BSTNode minimum(BSTNode x) {
		while(x.getLeft() != null) {
			x = x.getLeft();
		}
		return x;
	}
	
	/**
	 * 
	 * @return the rightmost element of the tree
	 */
	
	public BSTNode maximum() {
		return maximum(root);
	}
	
	private BSTNode maximum(BSTNode x) {
		while(x.getRight() != null) {
			x = x.getRight();
		}
		return x;
	}
	
	/**
	 * 
	 * @param key the value we want to find the predecessor of
	 * @return the closest right parent on the subtree
	 */
	
	public BSTNode predecessor(int key) {
		BSTNode node = search(key);
		return predecessor(node);
	}
	
	private BSTNode predecessor(BSTNode x) {
		if(x.getLeft() != null) {
			return maximum(x.getLeft());
		}
		while(x.getP() != null && x == x.getP().getLeft()) {
			x = x.getP();
		}
		
		return x.getP();
	}
	
	/**
	 * 
	 * @param key the value we want to find the successor of
	 * @return the closest left parent on the subtree
	 */
	
	public BSTNode successor(int key) {
		BSTNode node = search(key);
		return successor(node);
	}
	
	private BSTNode successor(BSTNode x) {
		if(x.getRight() != null) {
			return minimum(x.getRight());
		}
		while(x.getP() != null && x == x.getP().getRight()) {
			x = x.getP();
		}
		return x.getP();
	}
	
	/**
	 * Inserts a value into the tree
	 * 
	 * @param node the value we will insert into the tree
	 */
	
	public void insert(BSTNode node) {
		insert(this, node);
	}
	
	private void insert(BinarySearchTree T, BSTNode z) {
		BSTNode y = null;
		BSTNode x = T.root;
		while(x != null) {
			y = x;
			if(z.getKey() < x.getKey()) {
				x = x.getLeft();
			}
			else x = x.getRight();
			
		}
		
		z.setP(y);
		if(y == null) {
			T.root = z;
		}else if(z.getKey() < y.getKey()) {
			y.setLeft(z);
		}
		else {
			y.setRight(z);
		}
		size++;

	}
	
	/**
	 * Deletes a value from the tree
	 * 
	 * @param node the value we want to delete from the tree
	 */
	
	public void delete(BSTNode node) {
		delete(this, node);
	}
	
	private void delete(BinarySearchTree T, BSTNode z) {
		if(z.getLeft() == null) {
			transplant(T, z, z.getRight());
		}else if(z.getRight() == null) {
			transplant(T, z, z.getLeft());
		}else {
			BSTNode y = minimum(z.getRight());
			if(y.getP() != z) {
				transplant(T, y, y.getRight());
				y.setRight(z.getRight());
				y.getRight().setP(y);
			}
			transplant(T, z, y);
			y.setLeft(z.getLeft());
			y.getLeft().setP(y);
			
		}
		size--;
	}
	
	/**
	 * Traverses the tree with PreOrder; Prints the first time it touches elements
	 */
	
	public void PreOrderTraversal() {
		PreOrderTraversal(this.root);
	}

	private void PreOrderTraversal(BSTNode T) {
		if(T != null) {
			System.out.print(T.getKey() + " ");
			PreOrderTraversal(T.getLeft());
			PreOrderTraversal(T.getRight());
		}
	}

	/**
	 * Traverses the tree InOrder; Prints the elements in order
	 */
	
	public void InOrderTraversal() {
		InOrderTraversal(this.root);
	}
	
	private void InOrderTraversal(BSTNode T) {
		if(T != null) {
			InOrderTraversal(T.getLeft());
			System.out.print(T.getKey() + " ");
			InOrderTraversal(T.getRight());
		}
	}
	
	/**
	 * Traverses the tree in PostOrder; Prints the last time it touches elements
	 */
	
	public void PostOrderTraversal() {
		PostOrderTraversal(this.root);
	}
	
	private void PostOrderTraversal(BSTNode T) {
		if(T != null) {
			PostOrderTraversal(T.getLeft());
			PostOrderTraversal(T.getRight());
			System.out.print(T.getKey() + " ");
		}
	}
	
	/**
	 * Conducts a select query 
	 * 
	 * @param i the position we want to look for
	 * @return the value in the i position
	 */
	
	public BSTNode select(int i) {
		return select(root, i);
	}

	private BSTNode select(BSTNode x, int i) {
		int r = 1;
		
		if(x.getLeft() != null) {
			r = x.getLeft().getSize() + 1;;
		}
		
		if(i == r) {
			return x;
		}
		
		else if(i < r) {
			if(x.getLeft() == null)return null;
			return select(x.getLeft(), i);
		}
		else {
			if(x.getRight() == null) return null;
			return select(x.getRight(), i - r);
		}
	}
	
	/**
	 * Conducts a rank query
	 * 
	 * @param i the position where the element is found
	 * @return the rank in reference to the entire tree
	 */
	
	public int rank(int i) {
		BSTNode node = search(i);
		return rank(this, node);
	}
	
	private int rank(BinarySearchTree T, BSTNode x) {
		int r = 1;
		
		if(x.getLeft() != null) {
			r = x.getLeft().getSize() + 1;
		}
		
		BSTNode y = x;
		while(y != T.root) {
			if(y == y.getP().getRight() && y.getP().getRight() != null) {
				if(y.getP().getLeft() != null) {
					r = r + y.getP().getLeft().getSize() + 1;
				}
			}else {
				r++;
			}
			y = y.getP();
		}
		return r;
	}
	
}
