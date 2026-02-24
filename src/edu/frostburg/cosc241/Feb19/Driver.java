package edu.frostburg.cosc241.Feb19;

public class Driver {

	public static void main(String[] args) {
		ArrayMachine arrays = new ArrayMachine();
		
//		// an aside: integer division in Java
//		System.out.println(5/2);
//		System.out.println(5.0/2);
		
		
//		int[] array = arrays.getRandomArray(50);
//		int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
//		arrays.print(array);
//		int t = -1;
//		int idx = arrays.find(t, array);
//		System.out.printf("We looked for %d and got %d%n", t, idx);
//		idx = arrays.findBinaryStyle(t, array);
//		System.out.printf("We binary-looked for %d and got %d%n", t, idx);
		
		int[][] array = arrays.getRandom2DArray(10);
//		System.out.println(array);  <-- can't do this!  (prints the reference)
		arrays.print(array);
		int t = 25;
		int idx2 = arrays.find(t, array);
		System.out.printf("2D: Looked for %d and got %d%n", t, idx2);
	}

}
