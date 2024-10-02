package Java8Practice.tree.node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	TreeNode<Integer> root;
	int length;
	
	
	BinaryTree () {
		this.root = null;
		this.length = 0;
	}
	
	
	private static class TreeNode<T> {
		int data;
		TreeNode<T> left;
		TreeNode<T> right;
		
		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
			
		}
	}
	
	public void createBinartTree() {
		
		TreeNode<Integer> first = new TreeNode<Integer>(10);
		TreeNode<Integer> second = new TreeNode<Integer>(5);
		TreeNode<Integer> third = new TreeNode<Integer>(6);
		TreeNode<Integer> fouth = new TreeNode<Integer>(20);
		TreeNode<Integer> fifth = new TreeNode<Integer>(30);
		TreeNode<Integer> sixth = new TreeNode<Integer>(12);
		second.left = fouth;
		second.right=fifth;
		third.left = sixth;
		root = first;
		root.left = second;
		root.right = third;
		
	}
	
	
	public void recursivePreOrder(TreeNode<?> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		recursivePreOrder(root.left);
		recursivePreOrder(root.right);
		
	}
	
	
	public void itreatePreOrder(TreeNode<?> root) {
		if(root == null) {
			return;
		}
		
		Stack<TreeNode<?>> s = new Stack<BinaryTree.TreeNode<?>>();
		s.push(root);
		
		while(!s.isEmpty()) {
			TreeNode<?> temp = s.pop();
			System.out.println(temp.data);
			if(temp.right!=null) {
				s.push(temp.right);
			}
			
			if(temp.left!= null) {
				s.push(temp.left);
			}
		}
		
	}
	
	public void recursiveInOrder(TreeNode<?> root) {
		if(root == null) {
			return;
		}
		
		recursiveInOrder(root.left);
		System.out.println(root.data);
		recursiveInOrder(root.right);
	}
	
	public void itreateInOrder(TreeNode<?> root) {
		if(root == null) {
			return;
		}
		
		Stack<TreeNode<?>> s = new Stack<BinaryTree.TreeNode<?>>();
		
		while(!s.isEmpty() || root != null) {
		if( root != null) {
			s.push(root);
			root = root.left;
		} else {
			root = s.pop();
			System.out.println(root.data);
			root = root.right;
		}
		}
	}
	
	public void recursivePostOrder(TreeNode<?> root) {
		if(root == null) {
			return;
		}
		recursivePostOrder(root.left);
		recursivePostOrder(root.right);
		System.out.println(root.data);
	}
	
	public void itreatePostOrder(TreeNode<?> root) {
		if(root == null) {
			return;
		}
		
		Stack<TreeNode<?>> s = new Stack<BinaryTree.TreeNode<?>>();
		
		while (!s.isEmpty() || root != null) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				TreeNode<?> temp = s.peek().right;
				if (temp == null) {
					temp = s.pop();
					System.out.println(temp.data);
					while (!s.isEmpty() && temp == s.peek().right) {
						temp = s.pop();
						System.out.println(temp.data);
					}
				} else {
					root = temp;
				}

			}
		}
	}
	
	public void itreateLevelOrder(TreeNode<?> root) {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode<?>> queue = new LinkedList<BinaryTree.TreeNode<?>>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			TreeNode<?> temp = queue.poll();
			System.out.println(temp.data);
			if(temp.left!= null) {
				queue.offer(temp.left);
			}
			if(temp.right!=null) {
				queue.offer(temp.right);
			}
		}
		
	}
	
	public int toFindmaxRecursive(TreeNode<?> root) {
		int result = 0;
		if(root == null) {
			return 0;
		}
		result = root.data;
		int left = toFindmaxRecursive(root.left);
		int right = toFindmaxRecursive(root.right);
		if(left>result) {
			result = left;
		}
		
		if(right>result) {
			result = right;
		}
		return result;
		
	}

}
