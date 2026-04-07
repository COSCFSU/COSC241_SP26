package edu.frostburg.cosc241.Apr07;

/**
 * The basic unit of a linked-list.  Contains data and a reference
 * 	to the next link in the linked-list.
 */
public class Node {

	private int data;
	private Node next;
	
	public Node(int data, Node next) {
//		super();
		this.data = data;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
