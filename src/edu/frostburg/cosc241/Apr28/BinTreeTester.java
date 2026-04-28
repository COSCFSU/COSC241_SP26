package edu.frostburg.cosc241.Apr28;

public class BinTreeTester {

	public static void main(String[] args) {
		runTreeTest1();
	}

	private static void runTreeTest1() {
		BinTree tree = new BinTree(7);
		
		tree.printInorder();
		
		tree.printTree();
	}

}
