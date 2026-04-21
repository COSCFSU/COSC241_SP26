package edu.frostburg.cosc241.Apr16;

public class VectorTester {

	public static void main(String[] args) {
//		runTest00();
		runTest01();
	}

	private static void runTest01() {
		Vector v = new Vector(20);
		
		v.addBack(1);
		v.addBack(2);
		v.addBack(3);
		v.addBack(4);
		v.addBack(5);
		v.addBack(6);
		v.addBack(7);
		v.addBack(8);
		v.addBack(9);
		
		int x = v.remove(5);
		x = v.remove(3);
		v.remove(0);
		v.remove(-1);
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
