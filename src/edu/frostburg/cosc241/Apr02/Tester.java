package edu.frostburg.cosc241.Apr02;

public class Tester {

	public static void main(String[] args) {
		SortMachine sorter = new SortMachine();
		
//		int[] arr = sorter.getRandomNums(10, 100);
		int[] arr = new int[] {9, 8, 7, 6, 5, 4, 3, 2};
		
//		sorter.print(arr);
//		sorter.quickSort(arr);
//		sorter.print(arr);
		
		for (int i=0; i<5; i++) {
			arr = sorter.getRandomNums(10, 1000);
//			sorter.print(arr);
			sorter.quickSort(arr);
//			sorter.print(arr);
			boolean isOK = isSorted(arr);
			System.out.printf("Sorted?:%b -------%n", isOK);
		}
		
	}
	
	public static boolean isSorted(int[] arr) {
		for (int i=0; i<arr.length-1;i+=1) {
			if (arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}

}
