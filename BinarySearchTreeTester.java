
public class BinarySearchTreeTester {

	public static void main(String [] args) {
		BSTNode bNode1 = new BSTNode(1);
		BSTNode bNode2 = new BSTNode(2);
		BSTNode bNode3 = new BSTNode(3);
		BSTNode bNode4 = new BSTNode(4);
		BSTNode bNode5 = new BSTNode(5);
		BSTNode bNode6 = new BSTNode(6);
		BSTNode bNode7 = new BSTNode(7);
		BSTNode bNode8 = new BSTNode(8);
		BSTNode bNode9 = new BSTNode(9);
		BSTNode bNode10 = new BSTNode(10);
		BSTNode bNode11 = new BSTNode(11);
		BSTNode bNode12 = new BSTNode(12);
		BSTNode bNode13 = new BSTNode(13);
		BSTNode bNode14 = new BSTNode(14);
		BSTNode bNode15 = new BSTNode(15);
		BSTNode bNode16 = new BSTNode(16);
		BSTNode bNode17 = new BSTNode(17);
		BSTNode bNode18 = new BSTNode(18);
		BSTNode bNode19 = new BSTNode(19);
		BSTNode bNode20 = new BSTNode(20);
		BinarySearchTree b1 = new BinarySearchTree();

		
		b1.insert(bNode10);
		b1.insert(bNode15);
		b1.insert(bNode20);
		b1.insert(bNode2);
		b1.insert(bNode3);
		b1.insert(bNode5);
		b1.insert(bNode4);
		b1.insert(bNode17);
		b1.insert(bNode16);
		b1.insert(bNode19);
		b1.insert(bNode6);
		b1.insert(bNode1);
		b1.insert(bNode9);
		b1.insert(bNode8);
		b1.insert(bNode12);
		b1.insert(bNode13);
		b1.insert(bNode14);
		b1.insert(bNode11);
		b1.insert(bNode18);
		b1.insert(bNode7);
		
		System.out.println("TREE SIZE: " + b1.getSize());
		System.out.println();
		System.out.println("ALL ORDER TRAVERSALS");
		System.out.println();
		System.out.println("PreOrderTraversal: ");
		b1.PreOrderTraversal();
		System.out.println();
		System.out.println("InOrderTraversal: ");
		b1.InOrderTraversal();
		System.out.println();
		System.out.println("PostOrderTraversal: ");
		b1.PostOrderTraversal();
		System.out.println();
		System.out.println();

		System.out.println("ALL SEARCHES: ");

		for(int i = 16; i < 26; i++) {
			if(b1.search(i) != null) {
				System.out.println("Found key " + i + " at address " + b1.search(i) + "!");
			}else {
				System.out.println("Key not found!");
			}
		}
		System.out.println();
		System.out.println("DELETING NODES...");
		System.out.println();
		b1.delete(bNode4);
		b1.delete(bNode8);
		b1.delete(bNode12);
		b1.delete(bNode16);
		b1.delete(bNode20);
		
		
		System.out.println("TREE SIZE: " + b1.getSize());
		System.out.println("ONE MORE INORDER TRAVERSAL");
		b1.InOrderTraversal();
		System.out.println();
		
		System.out.println();
//		System.out.println("SELECT ALGORITHM");
//
//		System.out.println("SELECTING 1 " + b1.select(1));
//		System.out.println("SELECTING 2 " + b1.select(2));
//		System.out.println("SELECTING 7 " + b1.select(8));
//		System.out.println("SELECTING 8 " + b1.select(4));
//		System.out.println("SELECTING 9 " + b1.select(9));
		
		System.out.println();
		
		System.out.println();
		System.out.println("RANK ALGORITHM");
		System.out.println("rank 1 " + b1.rank(1));
		System.out.println("rank 2 " + b1.rank(2));
		System.out.println("rank 3 " + b1.rank(3));
		System.out.println("rank 4 " + b1.rank(4));
		System.out.println("rank 5 " + b1.rank(5));

	}
}
