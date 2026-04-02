package edu.frostburg.cosc241.Mar31;

/**
 * Algorithm examples for cosc241
 */
public class AlgorithmThing {

	/**
	 * Binary search
	 * @param list list to search.  Should be sorted.
	 * @param targ what to search for
	 * @return the index of the item if found, or -1
	 */
	public int binSearch(int[] list, int targ) {
		return binSearchRecursive(list, targ, 0, list.length-1);
	}
	
	private int binSearchRecursive(int[] list, int targ, int left, int right) {
		
		if(left >= right) { // there's no more sublist to search
			return -1;
		} // O(1)
		
		// look at middle of list
		int mid = (left + right) / 2; // O(1)

		if (list[mid] > targ) {
			right = mid - 1; // O(1)
			return binSearchRecursive(list, targ, left, right); // O(lg n)
		} else if (list[mid] < targ) {
			left = mid + 1; // O(1)
			return binSearchRecursive(list, targ, left, right); // O(lg n)
		} else if (list[mid] == targ) { 
			return mid; // O(1)
		}  // O(lg n) + O(1)

		return -1;
	} // O(lg n) + O(1) + O(1) + O(1)
}
