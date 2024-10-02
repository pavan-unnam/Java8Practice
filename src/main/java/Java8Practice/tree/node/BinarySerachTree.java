package Java8Practice.tree.node;


public class BinarySerachTree {
	
	TreeNode<?> root;
	int length;
	
	
	BinarySerachTree () {
		this.root = null;
		this.length = 0;
	}
	
	
	 static class TreeNode<T> {
		int data;
		TreeNode<?> left;
		TreeNode<?> right;
		
		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
			
		}
	}
	 
	 public void toInsert(int value) {
		 root = toInsert(root, value);
	 }
	
	public TreeNode<?> toInsert(TreeNode<?> root, int value) {
		if(root == null) {
			root = new TreeNode<Integer>(value);
			return root;
		}
		
		if(value < root.data) {
			root.left = toInsert(root.left, value);
		}
		
		if(value > root.data) {
			root.right = toInsert(root.right, value);
		}
		 return root;
		
	}
	
	public void recursiveInOrder() {
		recursiveInOrder(root);
	}
	
	public TreeNode<?>  serachWithvalue(int value) {
		return serachWithvalue(root, value);
	}
	
	private TreeNode<?> serachWithvalue(TreeNode<?> root, int value) {
		if(root == null || root.data == value) {
			return root;
		}
		
		if(value < root.data) {
			return serachWithvalue(root.left, value);
		}else {
			return serachWithvalue(root.right, value);
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

}
