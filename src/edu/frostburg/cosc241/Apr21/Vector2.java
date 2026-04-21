package edu.frostburg.cosc241.Apr21;

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


}
