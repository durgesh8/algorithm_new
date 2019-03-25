package tree;

import java.util.Stack;

public class BinarySearchTree {

	public TreeNode root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void insertIteratively(int data) {
		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			this.root = newNode;
		} else {
			TreeNode crrNode = root;
			while (crrNode != null) {
				TreeNode preNode = crrNode;
				if (data > crrNode.getData()) {
					crrNode = crrNode.getRightChild();
					if (crrNode == null)
						preNode.setRightChild(newNode);
				} else {
					crrNode = crrNode.getLeftChild();
					if (crrNode == null)
						preNode.setLeftChild(newNode);
				}
			}
		}
	}

	public boolean find(int data) {
		TreeNode crrNode = root;

		while (crrNode != null) {
			if (crrNode.getData() == data) {
				return true;
			}
			if (crrNode.getData() > data) {
				crrNode = crrNode.getLeftChild();
			} else
				crrNode = crrNode.getRightChild();
		}
		return false;
	}

	public void insertRecursively(int data) {
		insertRecFunction(root, data);
	}

	public TreeNode insertRecFunction(TreeNode node, int data) {

		if (node == null) {
			node = new TreeNode(data);
		} else {
			if (node.getData() > data) {
				node.setLeftChild(insertRecFunction(node.getLeftChild(), data));
			} else {
				node.setRightChild(insertRecFunction(node.getRightChild(), data));
			}
		}

		return node;
	}
	
	public void preOrderTraversalRecusrion(TreeNode root) {
		  
		TreeNode crrNode=root;
		if(crrNode==null)
			return;
			else {
				
			System.out.print(root.getData()+" ");
			preOrderTraversalRecusrion(root.getLeftChild());
			preOrderTraversalRecusrion(root.getRightChild());
		}
	}
	
	public void inOrderTraversalRecursion(TreeNode root) {
		TreeNode crrNode =root;
		if(crrNode==null)
			return;
		else {
			inOrderTraversalRecursion(root.getLeftChild());
			System.out.print(root.getData()+" ");
			inOrderTraversalRecursion(root.getRightChild());
		}
	}
	
	public void postOrderTraversalRecursion(TreeNode root) {
		if(root==null)
			return;
		else
		{
			postOrderTraversalRecursion(root.getLeftChild());
			postOrderTraversalRecursion(root.getRightChild());
			System.out.print(root.getData()+" ");
		}
	}

	public void preOrderTraversalWithoutRecursion(TreeNode root) {
		TreeNode crr=root;
		Stack<TreeNode> st=new Stack<>();
		while(crr!=null) {
			System.out.print(crr.getData()+" ");
			st.add(crr);
		     crr=crr.getLeftChild();	
		}
		
		while(!st.isEmpty()) {
			TreeNode crrNode=st.pop();
			if(crrNode.getRightChild()!=null) {
				crrNode=crrNode.getRightChild();
				while(crrNode!=null) {
					System.out.print(crrNode.getData()+" ");
					st.add(crrNode);
					crrNode=crrNode.getLeftChild();
				}
			}
		}
	}

	public void inOrderTraversalWithoutRecursion(TreeNode root) {
		TreeNode crr=root;
		Stack<TreeNode> st=new Stack<>();
		while(crr!=null) {
			st.add(crr);
		    crr=crr.getLeftChild();	
		}
		
		while(!st.isEmpty()) {
			 TreeNode crrNode=st.pop();
			 System.out.print(crrNode.getData()+" ");
			 if(crrNode.getRightChild()!=null) {
				 crrNode=crrNode.getRightChild();
				 while(crrNode!=null) {
						st.add(crrNode);
						crrNode=crrNode.getLeftChild();	
					}
			 }
		}
	}
	
	public void postOrderWithoutRecursion(TreeNode root) {
		Stack<TreeNode> st1=new Stack<TreeNode>();
		Stack<TreeNode> st2 =new Stack<TreeNode>();
		
		st1.add(root);
		while(!st1.isEmpty()) {
			TreeNode crrNode=st1.pop();
			st2.push(crrNode);
			if(crrNode.getLeftChild()!=null)
				st1.push(crrNode.getLeftChild());
			if(crrNode.getRightChild()!=null)
				st1.push(crrNode.getRightChild());
		}
		
		while(!st2.isEmpty()) {
			System.out.print(st2.pop().getData()+" ");
		}
	}

	public int countAllNode(TreeNode root) {
		 if(root==null)
			 return 0;
		 else
			 return (1+countAllNode(root.getLeftChild())+countAllNode(root.getRightChild()));
	}
	
	public int countLeafNode(TreeNode root) {
		int count =0;
		if(root==null)
			return 0;
		else if(root.getLeftChild()==null && root.getRightChild()==null) 
			count ++;
	
	
		count= count+countLeafNode(root.getLeftChild())+countLeafNode(root.getRightChild());
		return count;
	}
	
	public int countHalfLeafNode(TreeNode root) {
		int count =0;
		if(root==null)
			return 0;
		else if((root.getLeftChild()!=null && root.getRightChild()== null)|| (root.getRightChild()!=null && root.getLeftChild() == null))
                 count++;
		count= count +countHalfLeafNode(root.getLeftChild())+countHalfLeafNode(root.getRightChild());
		
			return  count;
	}
	
	public int  countFullNode(TreeNode root) {
		int count =0;
		if(root==null)
			return 0;
		else if(root.getLeftChild()!=null && root.getRightChild()!=null)
			count++;
		count=count+countFullNode(root.getLeftChild())+countFullNode(root.getRightChild());
		return count;
	}
	public int  countFullNodeIteratively(TreeNode root) {
		int count=0;
		Stack<TreeNode> st=new Stack<TreeNode>();
		st.push(root);
		while(!st.isEmpty()) {
			TreeNode crrNode=st.pop();
			if(crrNode.getLeftChild()!=null && crrNode.getRightChild()!=null)
				count++;
			if(crrNode.getLeftChild()!=null)
				st.push(crrNode.getLeftChild());
			if(crrNode.getRightChild()!=null)
				st.push(crrNode.getRightChild());
			
		}
		return count;
		
	}
	
}
