
public class BinarySearchTree {

	public BSTNode root;
	public int size;
	
	public BinarySearchTree(){
		root = null;
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	private void transplant(BinarySearchTree T, BSTNode u, BSTNode v) {
		if(u.p == null) {
			T.root = v;
		}else if(u == u.p.left){
			u.p.left = v;
		}else u.p.right = v;
		if(v != null) {
			v.p = u.p;
		}
	}
	
	private BSTNode searchHelper(BSTNode x, int k) {
		if(x == null) {
			return null;
		}
		if(k == x.getKey()) {
			return x;
		}
		if(k < x.getKey()) {
			return searchHelper(x.left, k);
		}
		else return searchHelper(x.right, k);
	}
	
	private BSTNode minimumHelper(BSTNode x) {
		while(x.left != null) {
			x = x.left;
		}
		return x;
	}
	
	private BSTNode maximumHelper(BSTNode x) {
		while(x.right != null) {
			x = x.right;
		}
		return x;
	}
	
	private BSTNode predecessorHelper(BSTNode x) {
		if(x.left != null) {
			return maximumHelper(x.left);
		}
		while(x.p != null && x == x.p.left) {
			x = x.p;
		}
		
		return x.p;
	}
	
	private BSTNode successorHelper(BSTNode x) {
		if(x.right != null) {
			return minimumHelper(x.right);
		}
		while(x.p != null && x == x.p.right) {
			x = x.p;
		}
		return x.p;
	}
	
	private void insertHelper(BinarySearchTree T, BSTNode z) {
		BSTNode y = null;
		BSTNode x = T.root;
		while(x != null) {
			y = x;
			if(z.getKey() < x.getKey()) {
				x = x.left;
			}
			else { 
				x = x.right;
			}
		}
		z.p = y;
		if(y == null) {
			T.root = z;
			size++;
		}else if(z.getKey() < y.getKey()) {
			y.left = z;
			size++;
		}
		else {
			y.right = z;
			size++;
		}
		
	}
	
	private void deleteHelper(BinarySearchTree T, BSTNode z) {
		if(z.left == null) {
			transplant(T, z, z.right);
		}else if(z.right == null) {
			transplant(T, z, z.left);
		}else {
			BSTNode y = minimumHelper(z.right);
			if(y.p != z) {
				transplant(T, y, y.right);
				y.right = z.right;
				y.right.p = y;
				size--;
			}
			transplant(T, z, y);
			y.left = z.left;
			y.left.p = y;
			size--;
		}
	}
	
	private void PreOrderTraversalHelper(BSTNode T) {
		if(T != null) {
			System.out.println(T.getKey() + " ");
			PreOrderTraversalHelper(T.left);
			PreOrderTraversalHelper(T.right);
		}
	}
	
	private void InOrderTraversalHelper(BSTNode T) {
		if(T != null) {
			InOrderTraversalHelper(T.left);
			System.out.println(T.getKey() + " ");
			InOrderTraversalHelper(T.right);
		}
	}
	
	private void PostOrderTraversalHelper(BSTNode T) {
		if(T != null) {
			PostOrderTraversalHelper(T.left);
			PostOrderTraversalHelper(T.right);
			System.out.println(T.getKey() + " ");
		}
	}

	private BSTNode select(BSTNode x, int i) {
		int r = x.left.size + 1;
		if(i == r) {
			return x;
		}
		
		else if(i < r) {
			return select(x.left, i);
		}
		else {
			return select(x.right, i - r);
		}
	}
	
	private int rank(BinarySearchTree T, BSTNode x) {
		int r = x.left.size + 1;
		BSTNode y = x;
		while(y != T.root) {
			if(y == y.p.right) {
				r = r + y.p.left.size + 1;
			}
			y = y.p;
		}
		return r;
	}
	
}
