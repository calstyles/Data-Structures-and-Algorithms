public class secondTester {
	public static void main(String[] args) {
		BSTNode bNode1 = new BSTNode(12);
		BSTNode bNode2 = new BSTNode(48);
		BSTNode bNode3 = new BSTNode(36);
		BSTNode bNode4 = new BSTNode(31);
		BSTNode bNode5 = new BSTNode(96);
		BSTNode bNode6 = new BSTNode(63);
		BSTNode bNode7 = new BSTNode(13);
		BSTNode bNode8 = new BSTNode(95);
		BSTNode bNode9 = new BSTNode(57);
		BSTNode bNode10 = new BSTNode(68);
		BSTNode bNode11 = new BSTNode(12);
		BSTNode bNode12 = new BSTNode(1);
		BSTNode bNode13 = new BSTNode(23);
		BSTNode bNode14 = new BSTNode(52);
		BSTNode bNode15 = new BSTNode(73);
		BSTNode bNode16 = new BSTNode(92);
		BSTNode bNode17 = new BSTNode(99);
		BSTNode bNode18 = new BSTNode(33);
		BSTNode bNode19 = new BSTNode(18);
		BSTNode bNode20 = new BSTNode(13);
		BSTNode bNode21 = new BSTNode(56);
		BSTNode bNode22 = new BSTNode(5);
		BSTNode bNode23 = new BSTNode(1);
		BSTNode bNode24 = new BSTNode(7);
		BSTNode bNode25 = new BSTNode(42);
		BSTNode bNode26 = new BSTNode(51);
		BSTNode bNode27 = new BSTNode(79);
		BSTNode bNode28 = new BSTNode(70);
		BSTNode bNode29 = new BSTNode(20);
		BSTNode bNode30 = new BSTNode(32);
		BinarySearchTree b1 = new BinarySearchTree();
		
		b1.insert(bNode1);
		b1.insert(bNode2);
		b1.insert(bNode3);
		b1.insert(bNode4);
		b1.insert(bNode5);
		b1.insert(bNode6);
		b1.insert(bNode7);
		b1.insert(bNode8);
		b1.insert(bNode9);
		b1.insert(bNode10);
		b1.insert(bNode11);
		b1.insert(bNode12);
		b1.insert(bNode13);
		b1.insert(bNode14);
		b1.insert(bNode15);
		b1.insert(bNode16);
		b1.insert(bNode17);
		b1.insert(bNode18);
		b1.insert(bNode19);
		b1.insert(bNode20);
		b1.insert(bNode21);
		b1.insert(bNode22);
		b1.insert(bNode23);
		b1.insert(bNode24);
		b1.insert(bNode25);
		b1.insert(bNode26);
		b1.insert(bNode27);
		b1.insert(bNode28);
		b1.insert(bNode29);
		b1.insert(bNode30);
		
		b1.delete(bNode13);
		b1.delete(bNode28);
		b1.delete(bNode30);
		b1.delete(bNode27);
		b1.delete(bNode19);
		b1.delete(bNode2);
		b1.delete(bNode23);
		b1.delete(bNode24);
		b1.delete(bNode11);
		b1.delete(bNode17);
		
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
		
		System.out.println(b1.rank(bNode1));
		System.out.println(b1.select(1).getKey());
		
	}
}