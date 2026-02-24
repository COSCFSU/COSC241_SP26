package edu.frostburg.cosc241.Feb19;

import java.util.Random;

public class ArrayMachine {

	/**
	 * Sequential search on an array.
	 * @param target what we want to find
	 * @param array where we will look
	 * @return the index of the item, or -1 (if not found)
	 */
	public int find(int target, int[] array) {	
		// sequential search (aka linear search)
		for(int i=0; i<array.length; i+=1) {
			if(array[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int find(int target, int[][] array) {
		for (int i=0; i<array.length; i+=1) {
			for (int j=0; j<array[i].length; j+=1) {
				if(array[i][j] == target) {
					System.out.printf("Found at %d,%d%n", i, j);
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * Binary search to find target
	 * @param target what we want to find
	 * @param array where we are looking
	 * @return index of the item or -1
	 */
	public int findBinaryStyle(int target, int[] array) {
		// get left boundary
		int left = 0;
		// get right boundary
		int right = array.length - 1;
		// loop
		while (left <= right) {
			// find mid
			int mid = (left + right) / 2;
			// if array[mid] == target
			if (array[mid] == target) {
				// return index
				return mid;
			} else if(array[mid] > target) { // if array[mid] > target
				// right boundary = middle - 1
				right = mid - 1;
			} else if(array[mid] < target) { // if array[mid] < target
				// left boundary = middle + 1
				left = mid + 1;
			}
		}
		return -1;
	}
	
	/**
	 * Makes an array of size n and fills it with random numbers.
	 * @param n the size
	 * @return a new array
	 */
	public int[] getRandomArray(int n) {
		Random rando = new Random();
		
		int[] array = new int[n];
		for(int i=0; i<array.length; i+=1) {
			array[i] = rando.nextInt(50) + 1;
		}
		
		return array;
	}
	
	public int[][] getRandom2DArray(int len) {
		Random rando = new Random();
		
		int[][] array = new int[len][len];
		for(int i=0; i<array.length; i+=1) { // row
			for(int j=0; j<array[i].length; j+=1) { // col
				array[i][j] = rando.nextInt(50) + 1;
			}
		}
		
		return array;
	}
	
	/**
	 * Print out the contents of an array.  (To look like Python prints!)
	 * @param a the array
	 */
	public void print(int[] a) {
		System.out.print("[");
		for(int i=0; i<a.length-1; i+=1) {
			System.out.printf("%3d,", a[i]);
		}
		System.out.printf("%3d]%n", a[a.length-1]);
	}
	
	/**
	 * Prints this 2d array
	 * @param a the 2d array to print
	 */
	public void print(int[][] a) {
		for (int i=0; i<a.length; i+=1) {
			for (int j=0; j<a[i].length; j+=1) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
