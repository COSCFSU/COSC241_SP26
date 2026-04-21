package edu.frostburg.cosc241.Apr16;

import java.util.NoSuchElementException;

/**
 * COSC implementation of a dynamic array.
 * 
 * Java calls this an ArrayList.  C++ calls it a Vector.
 * 
 * April 14, 2026
 */
public class Vector {
	// fields
	public static final int DEFAULT_SIZE = 10; // constant

	private int[] data;
	private int count;

	// constructors
	public Vector(int[] data, int count) {
		this.data = data;
		this.count = count;
	}

	public Vector(int n) {
		this(new int[n], 0);
	}

	public Vector() {
		this(new int[DEFAULT_SIZE], 0);
	}

	// addFront(e)
	public void addFront(int e) {
		if (count >= data.length) {
			resize();
		}
		// shift elements to the right
		for (int i = count; i > 0; i -= 1) {
			data[i] = data[i - 1];
		}
		// add new element
		data[0] = e;
		count += 1;
	}

	// addBack(e)
	public void addBack(int e) {
		if (count >= data.length) {
			resize();
		}
		data[count++] = e;
	}
	
	// remFront
	public int remFront() {
		if (count == 0) {
			throw new NoSuchElementException();
		}
		int r = data[0];
		count -= 1;
		for (int i=0; i<count; i++) {
			data[i] = data[i+1];
		}
		return r;
	}
	
	// remBack
	public int remBack() {
		if (count == 0) {
			throw new NoSuchElementException();
		}
		int r = data[--count];
		return r;
	}

	/**
	 * Insert an element somewhere in the list. 
	 * @param i index
	 * @param e element
	 */
	public void insert(int i, int e) {
		if (i < 0 || i > count) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (i == 0) {
			addFront(e);
		} else if (i == count) {
			addBack(e);
		} else {
			if (count >= data.length) {
				resize();
			}
			// move stuff out of the way
			for (int j=count; j>i; j--) {
				data[j] = data[j-1];
			}
			data[i] = e;
			count += 1;
		}
	}

	/**
	 * Create a new array for data and copy all the elements over, effectively
	 * increasing the size of our Vector.
	 */
	private void resize() {
		int[] resizedArray = new int[data.length * 2]; // new array

		// copy
		for (int i = 0; i < count; i += 1) {
			resizedArray[i] = data[i];
		}

		data = resizedArray;
	}
	
	
	// other methods ------------------------
	
	// trim()
	
	// get(i)
	public int get(int i) {
		return data[i];
	}
	
	// set(i,e)
	public void set(int i, int e) {
		data[i] = e;
	}
	
	// remove(i)
	/**
	 * Remove element at index i if it exists, returning it.
	 * @param i index
	 * @return element removed
	 */
	public int remove(int i) {
		if (i < 0 || i >= count) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (i == 0) {
			return remFront();
		} else if (i == count -1) {
			return remBack();
		}
		
		int r = data[i];
		for (int j=i; j<count; j++) {
			data[j] = data[j+1];
		}
		count--;
		return r;
	}
	// contains(e)
	
	// indexOf(e)
}
