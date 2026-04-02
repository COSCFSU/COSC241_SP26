package edu.frostburg.cosc241.Mar24;

import java.util.Scanner;

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
	
//	public boolean isPal(String str) {
//		return isPal(str, 0, str.length() - 1);
//	}
//	
//	private boolean isPal(String str, int left, int right) {
//		
//	}
	
	
	/*************** ------------------------- 
	 * Thursday Examples
	 */
	
	/**
	 * Sum an array
	 * @param arr the array to sum
	 * @return the total value of all of the ints int that array
	 */
	public long sum(int[] arr) {
		return sum(arr, 0);
	}
	
	private long sum(int[] arr, int i) {
		// base case
		if (i == arr.length - 1) {
			return arr[i];
		}
		
		// recursive case
		return sum(arr, i+1) + arr[i];		
	}
	
	public void printWeird(String s) {
		if (s.length() == 0) {
			return;
		}
		
		System.out.print(s);
		printWeird(s.substring(1));
		System.out.print(s);
	}
	
	
	
	
	
	// Infix -> 1+1
	// Prefix -> +11
	
	/**
	 * Prefix notation calculator
	 */
	public double evaluate(String expression) {
		Scanner scanner = new Scanner(expression); // use scanner to parse the string
		return evaluate(scanner);
	}
	
	/**
	 * Recursive procedure to do infix notation
	 * @param input
	 * @return
	 */
	public double evaluate(Scanner input) {
		// base case - do we have a number?
		if (input.hasNextDouble()) {
			return input.nextDouble();
		}
	
		// recursive case
		// 	1) get operator
		String operator = input.next();
		//	2) get operands
//		double opLeft = input.nextDouble(); // <-- original non-solution
//		double opRight = input.nextDouble(); // <-- original non-solution
		double opLeft = evaluate(input);
		double opRight = evaluate(input);
				
		//	3) do that operation on the operands
		switch (operator) {
		case "+":
			return opLeft + opRight;
//			return input.nextDouble() + input.nextDouble();
//			return evaluate(input) + evaluate(input);
		case "-":
			return opLeft - opRight;
		case "*":
			return opLeft * opRight;
		}
		return -1.0;
	}
}
