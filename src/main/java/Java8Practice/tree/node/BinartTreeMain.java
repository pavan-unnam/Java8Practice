package Java8Practice.tree.node;

public class BinartTreeMain {

	public static void main(String[] args) {
		// Binary Tree opreations
		BinaryTree bt = new BinaryTree();
		bt.createBinartTree();
		bt.recursivePreOrder(bt.root);
		bt.itreatePreOrder(bt.root);
		bt.recursiveInOrder(bt.root);
		bt.itreateInOrder(bt.root);
		bt.recursivePostOrder(bt.root);
		bt.itreatePostOrder(bt.root);
		System.out.println("performing level order travresing");
		bt.itreateLevelOrder(bt.root);
		System.out.println(bt.toFindmaxRecursive(bt.root));
		
		// BinarySearchTree opreations
		BinarySerachTree bst = new BinarySerachTree();
		bst.toInsert(10);
		bst.toInsert(5);
		bst.toInsert(11);
		bst.toInsert(4);
		bst.toInsert(3);
		bst.toInsert(2);
		bst.toInsert(1);
		bst.recursiveInOrder();
		if(null !=bst.serachWithvalue(30)) {
			System.out.println("Keyfound");
		} else {
			System.out.println("Key not found");
		}
		
		
		
	}

}
