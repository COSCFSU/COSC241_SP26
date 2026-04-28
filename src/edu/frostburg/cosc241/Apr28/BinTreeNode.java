package edu.frostburg.cosc241.Apr28;

/**
 * Node for a binary tree.
 * 
 * @author sdkennedy & friends
 */
public class BinTreeNode {
	private int data;
	private BinTreeNode left;
	private BinTreeNode right;
	
	public BinTreeNode(int data) {
		this(data, null, null);
	}
	
	public BinTreeNode(int data, BinTreeNode left, BinTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public int data() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinTreeNode left() {
		return left;
	}
	public void setLeft(BinTreeNode left) {
		this.left = left;
	}
	public BinTreeNode right() {
		return right;
	}
	public void setRight(BinTreeNode right) {
		this.right = right;
	}
	
	
}
