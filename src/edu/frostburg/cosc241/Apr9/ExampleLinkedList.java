package edu.frostburg.cosc241.Apr9;

import java.util.NoSuchElementException;

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
	
	// addfirst
	public void addFirst(int e) {
		Node nNode = new Node(e, null);
		if (count == 0) {
			head = tail = nNode;
		} else { // i.e. not empty
			nNode.setNext(head);
			head = nNode;
		}
		count += 1;
	}
	
	// remFirst
	public int remFirst() {
		if (count == 0) { // nothing here to return
			throw new NoSuchElementException();
		} else if (count == 1) {
			int r = head.getData();		
			head = tail = null;
			count -= 1;
			return r;
		} else { // count > 1
			int r = head.getData();
			head = head.getNext(); // note: we don't need to change tail
			count -= 1;
			return r;
		}
	}
	
	// remlast
	public int remLast() {
		if (count == 0) {
			throw new NoSuchElementException();
		} else if (count == 1) {
			int r = tail.getData();
			tail = head = null;
			count -= 1;
			return r;
		} else { // count > 1
			int r = tail.getData();
			
			// make the next to last element the tail
			int n = count - 2;
			Node current = head; // after, current will point to right node
			for (int i=0; i<n; i++) {
				current = current.getNext();
			}
			
			tail = current;
			count -=1;
			return r;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	/**
	 * Insert an element into this list at any position. 
	 * @param i the position (i.e. index) for the new element
	 * @param e the element to add to this list
	 */
	public void insert(int i, int e) {
		// insert at the front
		if (i == 0) {
			addFirst(e);
		} else if (i == count) { // insert at the back
			addLast(e);
		} else { // insert somewhere in the middle
			Node nNode = new Node(e, null);
			
			Node prev = head;
			for(int j=0; j<i; j++) {
				prev = prev.getNext();
			}
			nNode.setNext(prev.getNext());
			prev.setNext(nNode);
		}
	}
	
	// toString
	
	// printList
	public void printQueue() {
		Node curr = head;
		while(curr.getNext() != null) {
			System.out.print(curr.getData() + " ");
			curr = curr.getNext();
		}
		System.out.println(curr.getData());
	}
}
