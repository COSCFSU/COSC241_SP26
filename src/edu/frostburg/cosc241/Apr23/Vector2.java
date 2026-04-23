package edu.frostburg.cosc241.Apr23;

public class Vector2<T> {
	private T[] data;
	private int size;
	
	public Vector2(T[] data, int size) {
		this.data = data;
		this.size = size;
	}
	
	/**
	 * 
	 * @param e
	 */
	public void addLast(T e) {
		data[size++] = e;
	}
	
	/**
	 * Get an object from this Vector2.
	 * @param i a valid index
	 * @return the object at that index
	 */
	public T get(int i) {
		return data[i];
	}
	
	//toString
	@Override
	public String toString() {
		StringBuilder r = new StringBuilder("");
		
		for(int i=0; i<size; i++) {
			r.append(data[i].toString());
		}
		
		return r.toString();
	}
	
	/**
	 * Compare two Vector2's for equivalence.
	 * 
	 * @param other The vector we are comparing this to.
	 * @return true if they are equal, false if not
	 */
	@Override
	public boolean equals(Object other) {
		if (this == other) { // another edge case... not important
			return true;
		} else if (other == null || !(other instanceof Vector2)) {
			return false;
		}
		// its a Vector2
		Vector2<T> otherV2 = (Vector2<T>)other;
		if(otherV2.size != size) {
			return false;
		}
		
		// Check if they are equal, return true if they are
		for (int i=0; i<size; i++) {
			T first = this.get(i);
			T second = otherV2.get(i);
			// then compare
			if (!first.equals(second)) {
				return false;
			}
		}
		
		return true;
	}

	/* -------------- Other cool methods ----------------- */
	
	@SuppressWarnings("unchecked")
	public void bubbleSort() {
		// outer loop
		//	iterate through elements (effectively creating a bubble)
		//	inner loop
			for (int j=0; j < size - 1; j++) {
			//		compare bubble items, swap if out of order
			Comparable<T> left = (Comparable<T>) data[j];
			T right = data[j+1];
			
			if (left.compareTo(right) > 0) {
				// whatever
			}
			}
		
	}
	
	/**
	 * Organize data using an insertion sort
	 */
	public void insertionSort() {
		// outer loop
		for (int i=1; i<size; i++) { // don't need to sort element 0 on its own
			// inner loop (aka insertion)
			for (int j=i; j>0; j--) {
				Comparable<T> left = (Comparable<T>) data[j-1];
				T right = data[j];
				if (left.compareTo(right) > 0) {
					swap(j-1, j);
				} else
					break; // remember: This is a hack, and hacks are generally frowned upon
			}
		}


	}
	
	private void swap(int left, int right) {
		T temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}
}
