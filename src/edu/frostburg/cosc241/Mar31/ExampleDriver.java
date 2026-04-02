package edu.frostburg.cosc241.Mar31;

public class ExampleDriver {

	public static void main(String[] args) {
//		int[] list = new int[] {234, 21, 2334, 8654, 345, 234, 234,23, 42,34, 1234,12, 3,4, 213,4, 123,47, 2};
		int[] list = new int[] { 10, 20, 30, 40, 50, 60, 70, 80 };
		
		AlgorithmThing al = new AlgorithmThing();
		int t = 35;
		int result = al.binSearch(list, t);
		System.out.printf("BinSearch for %d. Result:%d%n", t, result);
	}

}
