package tree;

public class TreeNode {

	private int data;
	private TreeNode rightChild;
	private TreeNode leftChild;
	
	public TreeNode(int data) {
		this.data=data;
		this.rightChild=null;
		this.leftChild=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	
	
	
}
