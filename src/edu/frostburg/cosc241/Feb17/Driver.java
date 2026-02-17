package edu.frostburg.cosc241.Feb17;

public class Driver {

	public static void main(String[] args) {
		ArrayExample ex = new ArrayExample();
		
		int[] array = new int[] {5,1,7,2,8,3};
		ex.print(array);
		
//		ex.showEx1();
		ex.bubbleSort(array);
//		System.out.println(array);
		ex.print(array);
	}

}
