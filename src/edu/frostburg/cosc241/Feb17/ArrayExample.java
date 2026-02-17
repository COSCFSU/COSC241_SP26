package edu.frostburg.cosc241.Feb17;

/**
 * Show some array stuff.
 */
public class ArrayExample {

	public void showEx1() {
		int[] myArr = new int[1];
		
		myArr[0] = 255;
		
		System.out.printf("Array len:%d Value:%d%n", myArr.length, myArr[0]);
		
//		System.out.println(myArr);	// <-- don't do this
		System.out.println(myArr[0]);
	}
	
	/**
	 * Sorts a list of integers using the Bubble Sort algorithm.
	 * @param arr The list that will be sorted.
	 */
	public void bubbleSort(int[] arr) {
		
		for(int j=0; j < arr.length-1; j+=1) {
			// loop bubble 1
			for(int i=0;i < arr.length-1; i+=1) { // alt: i=1; i<arr.len; i++
				// compare two numbers (bubble)
				// arr[0] compared to arr[1]
				if (arr[i] > arr[i+1]) { // aka if the first is > second
					// swap them
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	} // end of bubble sort method
	
	/**
	 * Print out the contents of an array.  (To look like Python prints!)
	 * @param a the array
	 */
	public void print(int[] a) {
		System.out.print("[");
		for(int i=0; i<a.length-1; i+=1) {
			System.out.printf("%d,", a[i]);
		}
		System.out.printf("%d]%n", a[a.length-1]);
	}
}
