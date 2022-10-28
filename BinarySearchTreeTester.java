
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
		System.out.println("preOrderTraversal: ");
		b1.preOrderTraversal();
		System.out.println();
		System.out.println("inOrderTraversal: ");
		b1.inOrderTraversal();
		System.out.println();
		System.out.println("postOrderTraversal: ");
		b1.postOrderTraversal();
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
		
		
		System.out.println("UPDATED TREE SIZE: " + b1.getSize());
		System.out.println("UPDATED INORDER TRAVERSAL");
		b1.inOrderTraversal();
		System.out.println();
		
		System.out.println();
		System.out.println("SELECT ALGORITHM");

		System.out.println("SELECTING 1: " + b1.select(1).getKey());
		System.out.println("SELECTING 2: " + b1.select(2).getKey());
		System.out.println("SELECTING 3: " + b1.select(3).getKey());
		System.out.println("SELECTING 4: " + b1.select(4).getKey());
		System.out.println("SELECTING 5: " + b1.select(5).getKey());
		System.out.println("SELECTING 6: " + b1.select(6).getKey());
		System.out.println("SELECTING 7: " + b1.select(7).getKey());
		System.out.println("SELECTING 8: " + b1.select(8).getKey());
		System.out.println("SELECTING 9: " + b1.select(9).getKey());
		System.out.println("SELECTING 10: " + b1.select(10).getKey());
		System.out.println("SELECTING 11: " + b1.select(11).getKey());
		System.out.println("SELECTING 12: " + b1.select(12).getKey());
		System.out.println("SELECTING 13: " + b1.select(13).getKey());
		System.out.println("SELECTING 14: " + b1.select(14).getKey());
		System.out.println("SELECTING 15: " + b1.select(15).getKey());
		
		System.out.println();
		
		System.out.println();
		System.out.println("RANK ALGORITHM");
		System.out.println("rank 1: " + b1.rank(bNode1));
		System.out.println("rank 2: " + b1.rank(bNode2));
		System.out.println("rank 3: " + b1.rank(bNode3));
		System.out.println("rank 5: " + b1.rank(bNode5));
		System.out.println("rank 6: " + b1.rank(bNode6));
		System.out.println("rank 7: " + b1.rank(bNode7));
		System.out.println("rank 9: " + b1.rank(bNode9));
		System.out.println("rank 10: " + b1.rank(bNode10));
		System.out.println("rank 11: " + b1.rank(bNode11));
		System.out.println("rank 13: " + b1.rank(bNode13));
		System.out.println("rank 14: " + b1.rank(bNode14));
		System.out.println("rank 15: " + b1.rank(bNode15));
		System.out.println("rank 17: " + b1.rank(bNode17));
		System.out.println("rank 18: " + b1.rank(bNode18));
		System.out.println("rank 19: " + b1.rank(bNode19));

		System.out.println();
		System.out.println("SUCCESSOR ALGORITHM");
		System.out.println("Successor for 10: " + b1.successor(10));
		System.out.println("Successor for 11: " + b1.successor(11));
		System.out.println("Successor for 14: " + b1.successor(14));
		System.out.println("Successor for 15: " + b1.successor(15));
		System.out.println("Successor for 17: " + b1.successor(17));
		
		System.out.println();
		System.out.println("PREDECESSOR ALGORITHM");
		System.out.println("Predecessor for 1: " + b1.predecessor(1));
		System.out.println("Predecessor for 7: " + b1.predecessor(7));
		System.out.println("Predecessor for 10: " + b1.predecessor(10));
		System.out.println("Predecessor for 13: " + b1.predecessor(13));
		System.out.println("Predecessor for 19: " + b1.predecessor(19));

		System.out.println();
		System.out.println("MAXIMUM AND MINIMUM");
		System.out.println("MAX NODE: " + b1.maximum());
		System.out.println("MIN NODE: " + b1.minimum());
	}
}
