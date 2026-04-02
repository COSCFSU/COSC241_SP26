package edu.frostburg.cosc241.Apr02;

import java.util.Random;

import edu.frostburg.cosc241.Mar31.AlgorithmThing;

public class SortMachine extends AlgorithmThing {

	
	public void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			
			// partition index
			int pi = partition(arr, low, high);  // <--- TODO: We'll change this
			
			quickSort(arr, low, pi - 1); // sort smaller nums (left)
			quickSort(arr, pi + 1, high); // sort bigger nums (right)
			
		} // otherwise, there is no partition to work on
	}
	
	/**
	 * Partitioning function for quickSort.  Selects a pivot,
	 * 	and then shuffles all the smaller values to the left of it,
	 * 	(leaving the bigger values on the right).
	 * @param arr the list that is being partitioned
	 * @param low the left of the current sublist
	 * @param high the right of the current sublist
	 * @return
	 */
	private int partition(int[] arr, int low, int high) {
		
		// choose the pivot
		int pivot = arr[high];
		
		// move smaller elements to the left of pivot
		//	(and larger to the right)
		int i = low - 1; // smaller num
		for (int j = low; j <= high -1; j+=1) {  // iterate through sublist
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		
		// fix pivot position
		swap(arr, i+1, high);
		return i+1;
	}
	
	/**
	 * Swap two values in an array
	 * @param arr the list
	 * @param i first position
	 * @param j second position
	 */
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	 * Get random integers in an array
	 * @param n the count
	 * @param boundary the numbers will be less than this
	 * @return the new array
	 */
	public int[] getRandomNums(int n, int boundary) {
		int[] nums = new int[n];
		
		Random R = new Random();
		for (int i=0; i<nums.length; i+=1) {
			nums[i] = R.nextInt(boundary);
		}
		
		return nums;
	}
	
	/**
	 * Prints array
	 * @param arr the array to print
	 */
	public void print(int[] arr) {
		for (int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
}
