
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
		}else if(u == u.p.getLeft()){
			u.getP().setLeft(v);
		}else u.getP().setRight(v);
		if(v != null) {
			v.setP(u.getP());
		}
	}
	
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
	
	public BSTNode minimum() {
		return minimum(root);
	}
	
	private BSTNode minimum(BSTNode x) {
		while(x.getLeft() != null) {
			x = x.getLeft();
		}
		return x;
	}
	
	public BSTNode maximum() {
		return maximum(root);
	}
	
	private BSTNode maximum(BSTNode x) {
		while(x.getRight() != null) {
			x = x.getRight();
		}
		return x;
	}
	
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
			if(y.p != z) {
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
	
	public BSTNode select(int i) {
		return select(root, i);
	}

	private BSTNode select(BSTNode x, int i) {
		int r = x.getLeft().getSize() + 1;
		
		if(x.getLeft() == null) {
			r = 1;
		}
		
		if(i == r) {
			return x;
		}
		
		else if(i < r) {
			return select(x.getLeft(), i);
		}
		else {
			System.out.println(x.getRight());
			System.out.println(i);
			return select(x.getRight(), i - r);
		}
	}
	
	public int rank(int i) {
		BSTNode node = search(i);
		return rank(this, node);
	}
	
	private int rank(BinarySearchTree T, BSTNode x) {
		int r = x.getLeft().getSize() + 1;
		
		if(x.getLeft() == null) {
			r = 1;
		}
		
		BSTNode y = x;
		while(y != T.root) {
			if(y == y.getP().getRight()) {
				r = r + y.getP().getLeft().getSize() + 1;
			}else {
				r++;
			}
			y = y.getP();
		}
		return r;
	}
	
}
