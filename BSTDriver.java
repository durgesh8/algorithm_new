package tree;

public class BSTDriver {

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insertIteratively(8);
		tree.insertIteratively(10);
		tree.insertIteratively(6);
		tree.insertIteratively(7);
		tree.insertRecursively(5);
		System.out.println(tree.find(5));
		tree.insertRecursively(20);
		tree.insertRecursively(25);
		tree.insertRecursively(9);
		System.out.println("PreOrder Rec");
		tree.preOrderTraversalRecusrion(tree.root);
		System.out.println();
		System.out.println("InOrder Rec");
		tree.inOrderTraversalRecursion(tree.root);
		System.out.println();
		System.out.println("PostOrder Rec");
		tree.postOrderTraversalRecursion(tree.root);
		System.out.println();
		System.out.println("PreOrder Iter");
		tree.preOrderTraversalWithoutRecursion(tree.root);
		System.out.println();
		System.out.println("InOrder Iter");
		tree.inOrderTraversalWithoutRecursion(tree.root);
		System.out.println();
		System.out.println("PostOrder Iter");
		tree.postOrderWithoutRecursion(tree.root);
		System.out.println();
		System.out.println("Count of all node: "+tree.countAllNode(tree.root));
//		System.out.println("Count Leaf Node: "+tree.countLeafNode(tree.root));
		System.out.println("Count HalfLeaf Node: "+tree.countHalfLeafNode(tree.root));
		System.out.println("Count Full Node: "+tree.countFullNode(tree.root));
		System.out.println("Count Full Node Iteratively: "+tree.countFullNodeIteratively(tree.root));
		
		System.out.println("Level Order Traversal ");
		tree.printLevelOrderTraversal(tree.root);
	}
}
