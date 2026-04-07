package edu.frostburg.cosc241.Apr07;

public class ExampleLinkedList {
	// head and tail
	private Node head;
	private Node tail;
	private int count;
	
	
	public ExampleLinkedList() {
		head = null;
		count = 0;
	}
	
	public void addLast(int e) {
		Node nNode = new Node(e, null);
		if (count == 0) {
//			head = nNode;
//			tail = nNode;
			head = tail = nNode;
		} else { // there is at least 1 element in the list
			// set tail to point to nNode
			tail.setNext(nNode);
			// set the tail to nNode
			tail = nNode;
		}
		count += 1;

	}
}
