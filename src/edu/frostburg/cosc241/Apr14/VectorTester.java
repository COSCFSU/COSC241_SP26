package edu.frostburg.cosc241.Apr14;

public class VectorTester {

	public static void main(String[] args) {
		runTest00();
	}

	private static void runTest00() {
		Vector v = new Vector(1);
		
		v.addBack(9);
		v.addBack(10);
		v.addBack(11);
		
		v.addFront(1);
		v.addFront(2);
		v.addFront(3);
		
		v.insert(3, 99);
		v.insert(3, 98);
		v.insert(3, 97);
		v.insert(1, 96);
		v.insert(7, 95);
		
		v.insert(999, 0); // error
		
		int a = v.remBack();
		a = v.remBack();
		a = v.remBack();
		
		
		int f = v.remFront();
		f = v.remFront();
		f = v.remFront();
		
		f = v.remFront(); // error
	}

}
