package edu.frostburg.cosc241.Apr28;

public class BinTree {
	private BinTreeNode root;
	private int size;
	
	public BinTree(int maxSize) {
		root = buildTree(1, maxSize);
	}
	
	private BinTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new BinTreeNode(n, buildTree(2*n, max), buildTree(2*n+1, max));
		}
	}
	
	public void printInorder() {
		printInorder(root);
	}
	
	private void printInorder(BinTreeNode root) {
		if (root.left() != null) { // left
			printInorder(root.left());
		}
		
		System.out.print(root.data() + " ");  // visit
		
		if (root.right() != null) { // right
			printInorder(root.right());
		}
	}
	
	public void printTree() {
		printTree(root, 1);
	}

	private void printTree(BinTreeNode root, int space) {
		// base case
		if (root == null) {
			return;
		}
		
		int spacing = 3;
		space += spacing;
		
		// right is on top
		printTree(root.right(), space);
		
		System.out.println();
		for (int i=spacing; i< space; i++) {
			System.out.print(" ");
		}
		System.out.println(root.data());
		
		printTree(root.left(), space);
	}
}
