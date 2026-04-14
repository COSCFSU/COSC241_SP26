package edu.frostburg.cosc241.Apr9;

public class ExampleStack {

	// state -----------------
	private int[] data;
	private int count;
	
	// behavior -------------
	
	/** Constructor
	 * Makes a new stack and returns it.
	 * @param n the size
	 */
	public ExampleStack(int n) {
		data = new int[n];
		count = 0;
	}
	
	/**
	 * Put element on top of the stack
	 * @param e element
	 */
	public void push(int e) {
		data[count++] = e;
//		data[count] = e;
//		count += 1;
	}
	
	/**
	 * Take element off of the stack
	 * @return the top element
	 */
	public int pop() {
//		count -= 1;
//		int e = data[count];
//		return e;
		
		return data[--count];
	}
	
	/**
	 * Look at the top element without removing it
	 * @return the top element
	 */
//	public int peek() {
//		
//	}
}
