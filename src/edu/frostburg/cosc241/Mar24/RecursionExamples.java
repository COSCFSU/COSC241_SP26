package edu.frostburg.cosc241.Mar24;

/**
 * Recursion examples.
 */
public class RecursionExamples {

	/**
	 * Basic recursion example.  (This is "tail" recursion).
	 * @param n
	 */
	public void a(int n) {
		// base case
		if (n == 0) {
			return;
		}
		System.out.println(n);
		// recursive case
		a(n-1); // <---- !
		System.out.println(n);
	}
	
	/**
	 * Adds numbers 1 to n
	 * @param n stopping number
	 * @return the sum of n's
	 */
	public int add(int n) {
		// base case
		if (n == 1) {
			return 1;
		}
		
		// recursive case
		return n + add(n-1);	
	}
	
	/**
	 * Get the power of a to the b
	 * @param a base
	 * @param b exponent
	 * @return a^b
	 */
	public long pow(int a, int b) {
		// base case
		if (b == 1) {
			return a;
		}
		
		// recursive case
		return a * pow(a, b - 1);
	}
	
	public String reverse(String s) {
		// base case
		if (s.isEmpty() || s.length() <= 0) {
			return s;
		}
		
		// recursive case
		return reverse(s.substring(1)) + s.charAt(0);

	}
	
	public boolean isPal(String str) {
		return isPal(str, 0, str.length() - 1);
	}
	
	private boolean isPal(String str, int left, int right) {
		
	}
}
